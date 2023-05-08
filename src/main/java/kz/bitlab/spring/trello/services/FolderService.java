package kz.bitlab.spring.trello.services;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.TaskCategory;

import java.util.List;

public interface FolderService {
    List<Folder> findAll();
    Folder findFolderById(Long id);
    void addFolder(Folder folder);
    void updateFolder(Folder folder);
//    void addTaskCategory(TaskCategory taskCategory);
}
