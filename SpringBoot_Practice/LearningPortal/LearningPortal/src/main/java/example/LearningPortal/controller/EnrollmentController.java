package example.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.entity.EnrollmentEntity;
import example.LearningPortal.service.EnrollmentService;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
	@Autowired
	private EnrollmentService enrollmentService;
	
	@GetMapping
	public List<EnrollmentEntity> findAll() {
		return enrollmentService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<EnrollmentEntity> findById(@PathVariable("id") Long id) {
		return enrollmentService.findById(id);
	}
}
