package kz.bitlab.spring.trello.services.impl;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.Task;
import kz.bitlab.spring.trello.repositories.TaskRepository;
import kz.bitlab.spring.trello.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> findByfolder(Folder folder) {
        return taskRepository.findByFolder(folder);
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public void addNewTask(Task task, Folder folder) {
        task.setStatus(0);
        task.setFolder(folder);
        taskRepository.save(task);
    }

    @Override
    public void editTask(Task task, Folder folder) {
        task.setFolder(folder);
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }


}
