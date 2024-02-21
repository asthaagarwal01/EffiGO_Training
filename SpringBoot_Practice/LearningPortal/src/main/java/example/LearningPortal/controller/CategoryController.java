package example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.CategoryService;
import example.LearningPortal.dto.CategoryDto;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "/getAllCategories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CategoryDto> findAllCategories() {
		List<CategoryDto> data = categoryService.findAllCategories();
		return data;
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDto findCategoryById(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDto saveCategory(@RequestBody CategoryDto categoryDto) {
		return categoryService.saveCategories(categoryDto);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDto updateCategory(@RequestBody CategoryDto updatedCategory) {
		return categoryService.updateCategories(updatedCategory);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategories(id);
	}

}
