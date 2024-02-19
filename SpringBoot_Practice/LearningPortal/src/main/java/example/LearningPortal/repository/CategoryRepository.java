package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.LearningPortal.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {

}
