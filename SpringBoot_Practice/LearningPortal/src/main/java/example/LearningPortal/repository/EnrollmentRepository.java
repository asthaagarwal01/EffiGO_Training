package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.LearningPortal.entity.EnrollmentEntity;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long>{

}
