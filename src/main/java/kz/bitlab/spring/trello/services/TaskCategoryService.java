package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.TaskCategory;

import java.util.List;

public interface TaskCategoryService {
    TaskCategory findById(Long id);
    List<TaskCategory> findAll();
}
