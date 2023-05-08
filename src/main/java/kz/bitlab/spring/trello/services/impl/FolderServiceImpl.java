package kz.bitlab.spring.trello.services.impl;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.TaskCategory;
import kz.bitlab.spring.trello.repositories.FolderRepository;
import kz.bitlab.spring.trello.services.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderServiceImpl implements FolderService {
    @Autowired
    private FolderRepository folderRepository;

    @Override
    public List<Folder> findAll() {
        return folderRepository.findAll();
    }

    @Override
    public Folder findFolderById(Long id) {
        return folderRepository.findById(id).orElse(null);
    }

    @Override
    public void addFolder(Folder folder) {
        folderRepository.save(folder);
    }

    @Override
    public void updateFolder(Folder folder) {
        folderRepository.save(folder);
    }

    @Override
    public List<Folder> findByCategoriesListContaining(TaskCategory taskCategory) {
        return folderRepository.findByCategoriesListContaining(taskCategory);
    }
}
