//package example.LearningPortal.Service.impl;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import example.LearningPortal.Service.CourseService;
//import example.LearningPortal.entity.CourseEntity;
//import example.LearningPortal.entity.UserEntity;
//import example.LearningPortal.repository.CourseRepository;
//import example.LearningPortal.repository.UserRepository;
//import example.LearningPortal.util.PasswordHashUtil;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//	@Autowired
//	private CourseRepository coursesrepo;
//
//	@Autowired
//	private UserRepository userepo;
//
//	public List<CourseEntity> findAllCourses(String username, String password) {
//		// Finding the user by username
//		Optional<UserEntity> userOptional = userepo.findByUsername(username);
//		if (userOptional.isPresent()) {
//			UserEntity user = userOptional.get();
//			// Verify the password
//			if (PasswordHashUtil.verifyPassword(password, user.getPasswordHash())) {
//
//				return coursesrepo.findAll();
//			} else {
//
//				return List.of();
//			}
//		} else {
//
//			return List.of();
//		}
//	}
//
//	public List<CourseEntity> getCoursesByCategoryId(Long categoryId) {
//		return coursesrepo.findByCategoryIdNative(categoryId);
//	}
//
//	public Optional<CourseEntity> findById(Long id) {
//		return coursesrepo.findById(id);
//	}
//
//	public CourseEntity saveCourses(CourseEntity course/*, Long authorId*/) {
//
//		/*	Optional<UserEntity> authorOptional = userepo.findById(authorId);
//			if (authorOptional.isPresent()) {
//				UserEntity author = authorOptional.get();
//		
//				course.setAuthor(author);*/
//
//		course.setCreatedOn(LocalDateTime.now());
//		course.setUpdatedOn(LocalDateTime.now());
//
//		return coursesrepo.save(course);
//		/*} else {
//			throw new EntityNotFoundException("Author with id " + authorId + " not found");
//		}*/
//	}
//
//	public CourseEntity updateCourses(Long id, CourseEntity updatedcourse) {
//		updatedcourse.setUpdatedOn(LocalDateTime.now());
//		return coursesrepo.save(updatedcourse);
//	}
//
//	public void deleteCourses(Long id) {
//		coursesrepo.deleteById(id);
//	}
//}
