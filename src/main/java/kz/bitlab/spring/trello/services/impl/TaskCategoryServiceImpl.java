package kz.bitlab.spring.trello.services.impl;

import kz.bitlab.spring.trello.entities.TaskCategory;
import kz.bitlab.spring.trello.repositories.TaskCategoryRepository;
import kz.bitlab.spring.trello.services.TaskCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCategoryServiceImpl implements TaskCategoryService {
    @Autowired
    private TaskCategoryRepository taskCategoryRepository;
    @Override
    public TaskCategory findById(Long id) {
        return taskCategoryRepository.findById(id).orElse(null);
    }
}
