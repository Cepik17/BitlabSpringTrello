package kz.bitlab.spring.trello.services.impl;

import kz.bitlab.spring.trello.entities.Comment;
import kz.bitlab.spring.trello.entities.Task;
import kz.bitlab.spring.trello.repositories.CommentRepository;
import kz.bitlab.spring.trello.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAllbyTask(Task task) {
        return commentRepository.findAllByTask(task);
    }

    @Override
    public void addComment(String comment, Task task) {
        Comment newcomment = new Comment();
        newcomment.setComment(comment);
        newcomment.setTask(task);
        commentRepository.save(newcomment);
    }

    @Override
    public Comment findCommentById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteComment(List<Comment> comments) {
        commentRepository.deleteAll(comments);
    }
}
