package example.learningportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.learningportal.dto.CategoryDto;
import example.learningportal.entity.CategoryEntity;
import example.learningportal.mapper.CategoryMapper;
import example.learningportal.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryMapper categoryMapper;

	@Autowired
	CategoryRepository categoryRepository;

	public List<CategoryDto> findAllCategories() {
		List<CategoryEntity> categoryEntities = categoryRepository.findAll();
		return categoryMapper.toDto(categoryEntities);
	}

	public CategoryDto findById(Long id) {
		Optional<CategoryEntity> categoryOptional = categoryRepository.findById(id);
		CategoryEntity category = categoryOptional.get();
		return categoryMapper.toDto(category);
	}

	public CategoryDto saveCategories(CategoryDto category) {
		CategoryEntity categoryEntity = categoryMapper.toEntity(category);
		categoryRepository.save(categoryEntity);
		return categoryMapper.toDto(categoryEntity);
	}

	public CategoryDto updateCategories(CategoryDto updatedcategory) {
		CategoryEntity categoryEntity = categoryMapper.toEntity(updatedcategory);
		categoryRepository.save(categoryEntity);
		return categoryMapper.toDto(categoryEntity);
	}

	public void deleteCategories(Long id) {
		Optional<CategoryEntity> categoryOptional = categoryRepository.findById(id);
		CategoryEntity category = categoryOptional.get();
		categoryRepository.delete(category);

	}
}
