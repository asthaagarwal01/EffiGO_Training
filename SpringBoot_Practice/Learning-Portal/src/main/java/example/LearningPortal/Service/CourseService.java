package example.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import example.LearningPortal.entity.CourseEntity;

public interface CourseService{
	List<CourseEntity>findAllCourses();
	
	Optional<CourseEntity>findById(Long id);
	CourseEntity saveCourses(CourseEntity user);
	CourseEntity updateCourses(Long id,CourseEntity updatedcourse);
	void deleteCourses(Long id);
}
