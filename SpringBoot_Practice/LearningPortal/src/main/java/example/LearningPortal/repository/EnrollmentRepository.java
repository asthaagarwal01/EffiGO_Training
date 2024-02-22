package example.learningportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.learningportal.entity.EnrollmentEntity;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long>{

}
