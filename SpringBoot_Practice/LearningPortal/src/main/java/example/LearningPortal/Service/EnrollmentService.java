package example.learningportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.learningportal.dto.EnrollmentDto;
import example.learningportal.entity.EnrollmentEntity;
import example.learningportal.mapper.EnrollmentMapper;
import example.learningportal.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

	@Autowired
	EnrollmentMapper enrollmentMapper;

	@Autowired
	EnrollmentRepository enrollmentRepository;

	public List<EnrollmentDto> findAll() {
		List<EnrollmentEntity> enrollmentEntities = enrollmentRepository.findAll();
		return enrollmentMapper.toDto(enrollmentEntities);
	}

	public EnrollmentDto findById(Long id) {
		Optional<EnrollmentEntity> enrollmentOptional = enrollmentRepository.findById(id);
		EnrollmentEntity enrollment = enrollmentOptional.get();
		return enrollmentMapper.toDto(enrollment);
	}
}
