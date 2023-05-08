package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();

    List<Task> findByfolder(Folder folder);

    Task findById(Long id);

    void addNewTask(Task task, Folder folder);

    void editTask(Task task, Folder folder);

    void deleteTask(Task task);

}
