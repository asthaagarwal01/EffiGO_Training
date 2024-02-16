package example.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.CategoryEntity;

@Service
public interface CategoryService {
	List<CategoryEntity> findAllCategories();

	Optional<CategoryEntity> findById(Long id);

	CategoryEntity saveCategories(CategoryEntity category);

	CategoryEntity updateCategories(Long id, CategoryEntity updatedcategory);

	void deleteCategories(Long id);
}
