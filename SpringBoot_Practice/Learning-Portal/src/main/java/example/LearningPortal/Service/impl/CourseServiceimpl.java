package example.LearningPortal.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.CourseEntity;
import example.LearningPortal.repository.CourseRepository;
import example.LearningPortal.service.CourseService;

@Service
public class CourseServiceimpl implements CourseService{
	private final CourseRepository coursesrepo;
	
	public CourseServiceimpl(CourseRepository courserepo) {
		this.coursesrepo = courserepo;
	}
	
	@Override
	public List<CourseEntity>findAllCourses(){
		return coursesrepo.findAll();
	}
	
	@Override
	public Optional<CourseEntity>findById(Long id){
		return coursesrepo.findById(id);
	}
	
	@Override
	public CourseEntity saveCourses(CourseEntity course) {
		course.setCreatedOn(LocalDateTime.now());
		course.setUpdatedOn(LocalDateTime.now());
		return coursesrepo.save(course);
	}
	
	@Override
	public CourseEntity updateCourses(Long id,CourseEntity updatedcourse) {
		updatedcourse.setUpdatedOn(LocalDateTime.now());
		return coursesrepo.save(updatedcourse);
	}
	
	@Override
	public void deleteCourses(Long id) {
		coursesrepo.deleteById(id);
	}

}
