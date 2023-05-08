package kz.bitlab.spring.trello.repositories;

import kz.bitlab.spring.trello.entities.Folder;
import kz.bitlab.spring.trello.entities.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findByCategoriesListContaining (TaskCategory category);
}
