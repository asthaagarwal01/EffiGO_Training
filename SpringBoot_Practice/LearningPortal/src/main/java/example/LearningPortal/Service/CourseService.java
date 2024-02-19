package example.LearningPortal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.CourseEntity;

@Service
public interface CourseService {
	List<CourseEntity> findAllCourses(String username, String password);

	Optional<CourseEntity> findById(Long id);

	List<CourseEntity> getCoursesByCategoryId(Long categoryId);

	CourseEntity saveCourses(CourseEntity user);

	CourseEntity updateCourses(Long id, CourseEntity updatedcourse);

	void deleteCourses(Long id);
}
