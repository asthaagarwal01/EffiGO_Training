package example.LearningPortal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.entity.EnrollmentEntity;

import example.LearningPortal.repository.EnrollmentRepository;
import example.LearningPortal.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentrepo;

	public List<EnrollmentEntity> findAll() {
		return enrollmentrepo.findAll();
	}

	public Optional<EnrollmentEntity> findById(Long id) {
		return enrollmentrepo.findById(id);
	}

}
