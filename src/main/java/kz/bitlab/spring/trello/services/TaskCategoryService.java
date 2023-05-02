package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.TaskCategory;

public interface TaskCategoryService {
    TaskCategory findById(Long id);
}
