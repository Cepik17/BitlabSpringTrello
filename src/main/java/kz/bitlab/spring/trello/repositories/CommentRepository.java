package kz.bitlab.spring.trello.repositories;

import kz.bitlab.spring.trello.entities.Comment;
import kz.bitlab.spring.trello.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByTask(Task task);
}
