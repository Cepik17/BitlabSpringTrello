package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.Comment;
import kz.bitlab.spring.trello.entities.Task;

import java.util.List;

public interface CommentService {
    List<Comment> findAllbyTask(Task task);

    void addComment(String comment, Task task);

    Comment findCommentById(Long id);

    void deleteComment(List<Comment> comments);
}
