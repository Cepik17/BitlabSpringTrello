package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
    List<Task> findByfolder(Folder folder);

}
