package kz.bitlab.spring.trello.controllers;

import kz.bitlab.spring.trello.entities.Task;
import kz.bitlab.spring.trello.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoriesController {
    @Autowired
    private TaskService taskService;
    @GetMapping ("/categories")
    public String allCategories(Model model){
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "categories";
    }
}
