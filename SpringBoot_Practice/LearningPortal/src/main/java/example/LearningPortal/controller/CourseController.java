package example.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.CourseService;
import example.LearningPortal.entity.CourseEntity;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping
	public List<CourseEntity> findAllCourses(@RequestParam String username, @RequestParam String password) {

		return courseService.findAllCourses(username, password);
	}

	@GetMapping("/{id}")
	public Optional<CourseEntity> findCourseById(@PathVariable Long id) {
		return courseService.findById(id);
	}

	@GetMapping("/byCategory/{categoryId}")
	public List<CourseEntity> getCoursesByCategoryId(@PathVariable Long categoryId) {
		return courseService.getCoursesByCategoryId(categoryId);
	}

	@PostMapping
	public CourseEntity saveCourse(@RequestBody CourseEntity course) {
		return courseService.saveCourses(course);
	}

	@PutMapping("/{id}")
	public CourseEntity updateCourse(@PathVariable Long id, @RequestBody CourseEntity updatedCourse) {
		return courseService.updateCourses(id, updatedCourse);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourses(id);
	}
}
