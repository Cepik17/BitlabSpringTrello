package kz.bitlab.spring.trello.controllers;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.Task;
import kz.bitlab.spring.trello.entities.TaskCategory;
import kz.bitlab.spring.trello.services.FolderService;
import kz.bitlab.spring.trello.services.TaskCategoryService;
import kz.bitlab.spring.trello.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FolderController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskCategoryService taskCategoryService;
    @Autowired
    private FolderService folderService;
    @GetMapping ("/folderdetails/{id}")
    public String folderDetails(@PathVariable Long id, Model model){
        Folder folder = folderService.findFolderById(id);
        List<Task> tasks = taskService.findByfolder(folder);
        model.addAttribute("folder", folder);
        model.addAttribute("tasks",tasks);
        return "folderdetails";
    }
    @PostMapping ("/deletecategory")
    public String deleteCategory(@RequestParam (name="category_id") Long categoryId,
                                 @RequestParam (name="folder_id") Long folderId){
        Folder folder = folderService.findFolderById(folderId);
        TaskCategory taskCategory = taskCategoryService.findById(categoryId);
        List<TaskCategory> taskCategories = folder.getCategoriesList();
        taskCategories.remove(taskCategory);
        folderService.updateFolder(folder);
        return "redirect:/folderdetails/" + folderId;
    }
}
