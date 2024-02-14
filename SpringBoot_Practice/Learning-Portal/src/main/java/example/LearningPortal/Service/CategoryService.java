package example.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import example.LearningPortal.entity.CategoryEntity;
import example.LearningPortal.entity.CourseEntity;

public interface CategoryService {
	List<CategoryEntity>findAllCategories();
	Optional<CategoryEntity>findById(Long id);
	CategoryEntity saveCategories(CategoryEntity category);
	CategoryEntity updateCategories(Long id,CategoryEntity updatedcategory);
	void deleteCategories(Long id);

}
