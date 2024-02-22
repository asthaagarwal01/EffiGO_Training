package example.learningportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.learningportal.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {

}
