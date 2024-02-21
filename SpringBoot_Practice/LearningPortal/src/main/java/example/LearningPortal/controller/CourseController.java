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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.CourseService;
import example.LearningPortal.dto.CourseDto;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CourseDto> findAllCourses(@RequestParam String username, @RequestParam String password) {

		return courseService.findAllCourses(username, password);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto findCourseById(@PathVariable Long id) {
		return courseService.findById(id);
	}

	@GetMapping(value = "/byCategory/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CourseDto> getCoursesByCategoryId(@PathVariable Long categoryId) {
		return courseService.getCoursesByCategoryId(categoryId);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto saveCourse(@RequestBody CourseDto course) {
		return courseService.saveCourses(course);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto updateCourse(@RequestBody CourseDto updatedCourse) {
		return courseService.updateCourses(updatedCourse);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourses(id);
	}
}
