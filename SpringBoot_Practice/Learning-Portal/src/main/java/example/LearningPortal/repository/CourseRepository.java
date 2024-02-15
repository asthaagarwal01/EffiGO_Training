package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LearningPortal.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {

	
}
