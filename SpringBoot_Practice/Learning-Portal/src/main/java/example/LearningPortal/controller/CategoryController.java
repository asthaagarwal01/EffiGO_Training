package example.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import example.LearningPortal.entity.CategoryEntity;
import example.LearningPortal.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryEntity> findAllCategories() {
        return categoryService.findAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<CategoryEntity> findCategoryById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public CategoryEntity saveCategory(@RequestBody CategoryEntity category) {
        return categoryService.saveCategories(category);
    }

    @PutMapping("/{id}")
    public CategoryEntity updateCategory(@PathVariable Long id, @RequestBody CategoryEntity updatedCategory) {
        return categoryService.updateCategories(id, updatedCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategories(id);
    }
}

