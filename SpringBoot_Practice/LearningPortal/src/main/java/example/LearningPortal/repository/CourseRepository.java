package example.LearningPortal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import example.LearningPortal.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
	@Query(value = "SELECT * FROM course WHERE category_id = ?1", nativeQuery = true)
	List<CourseEntity> findByCategoryIdNative(Long categoryId);
}
