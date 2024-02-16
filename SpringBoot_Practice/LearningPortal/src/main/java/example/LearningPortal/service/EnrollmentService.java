package example.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.EnrollmentEntity;

@Service
public interface EnrollmentService {
	List<EnrollmentEntity> findAll();

	Optional<EnrollmentEntity> findById(Long id);

	
}
