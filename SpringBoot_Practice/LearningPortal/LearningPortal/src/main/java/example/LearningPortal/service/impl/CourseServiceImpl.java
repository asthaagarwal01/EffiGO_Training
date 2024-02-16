package example.LearningPortal.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.entity.CourseEntity;
import example.LearningPortal.repository.CourseRepository;
import example.LearningPortal.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository coursesrepo;

	public List<CourseEntity> findAllCourses() {
		return coursesrepo.findAll();
	}

	public List<CourseEntity> getCoursesByCategoryId(Long categoryId) {
		return coursesrepo.findByCategoryIdNative(categoryId);
	}

	public Optional<CourseEntity> findById(Long id) {
		return coursesrepo.findById(id);
	}

	public CourseEntity saveCourses(CourseEntity course) {
		course.setCreatedOn(LocalDateTime.now());
		course.setUpdatedOn(LocalDateTime.now());
		return coursesrepo.save(course);
	}

	public CourseEntity updateCourses(Long id, CourseEntity updatedcourse) {
		updatedcourse.setUpdatedOn(LocalDateTime.now());
		return coursesrepo.save(updatedcourse);
	}

	public void deleteCourses(Long id) {
		coursesrepo.deleteById(id);
	}
}
