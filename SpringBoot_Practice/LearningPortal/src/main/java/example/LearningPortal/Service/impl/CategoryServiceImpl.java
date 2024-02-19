package example.LearningPortal.Service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.Service.CategoryService;
import example.LearningPortal.entity.CategoryEntity;
import example.LearningPortal.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryrepo;

	public List<CategoryEntity> findAllCategories() {
		return categoryrepo.findAll();
	}

	public Optional<CategoryEntity> findById(Long id) {
		return categoryrepo.findById(id);
	}

	public CategoryEntity saveCategories(CategoryEntity category) {
		category.setCreatedOn(LocalDateTime.now());
		category.setUpdatedOn(LocalDateTime.now());
		return categoryrepo.save(category);
	}

	public CategoryEntity updateCategories(Long id, CategoryEntity updatedcategory) {
		updatedcategory.setUpdatedOn(LocalDateTime.now());
		return categoryrepo.save(updatedcategory);
	}

	public void deleteCategories(Long id) {
		categoryrepo.deleteById(id);
	}
}
