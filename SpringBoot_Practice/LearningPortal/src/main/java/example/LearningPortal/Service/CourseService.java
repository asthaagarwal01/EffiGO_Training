package example.learningportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.learningportal.dto.CourseDto;
import example.learningportal.entity.CourseEntity;
import example.learningportal.entity.UserEntity;
import example.learningportal.mapper.CourseMapper;
import example.learningportal.repository.CourseRepository;
import example.learningportal.repository.UserRepository;
import example.learningportal.util.PasswordHashUtil;

@Service
public class CourseService {

	@Autowired
	CourseMapper courseMapper;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	UserRepository userRepository;

	public List<CourseDto> findAllCourses(String username, String password) {
		Optional<UserEntity> userOptional = userRepository.findByUsername(username);
		if (userOptional.isPresent()) {
			UserEntity user = userOptional.get();
			// Verify the password
			if (PasswordHashUtil.verifyPassword(password, user.getPasswordHash())) {

				List<CourseEntity> courseEntities = courseRepository.findAll();
				return courseMapper.toDto(courseEntities);
			} else {

				return List.of();
			}
		} else {

			return List.of();
		}
	}

	public CourseDto findById(Long id) {
		Optional<CourseEntity> courseOptional = courseRepository.findById(id);
		CourseEntity course = courseOptional.get();
		return courseMapper.toDto(course);
	}

	public List<CourseDto> getCoursesByCategoryId(Long categoryId) {

		List<CourseEntity> courses = courseRepository.findByCategoryIdNative(categoryId);
		return courseMapper.toDto(courses);
	}

	public CourseDto saveCourses(CourseDto course) {
		CourseEntity courseEntity = courseMapper.toEntity(course);
		courseRepository.save(courseEntity);
		return course;//courseMapper.toDto(courseEntity);
	}

	public CourseDto updateCourses(CourseDto updatedcourse) {
		CourseEntity courseEntity = courseMapper.toEntity(updatedcourse);
		courseRepository.save(courseEntity);
		return updatedcourse;
	}

	public void deleteCourses(Long id) {
		Optional<CourseEntity> courseOptional = courseRepository.findById(id);
		CourseEntity course = courseOptional.get();
		courseRepository.delete(course);
	}
}
