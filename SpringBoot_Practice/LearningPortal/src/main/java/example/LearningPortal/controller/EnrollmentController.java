package example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.EnrollmentService;
import example.LearningPortal.dto.EnrollmentDto;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
	@Autowired
	private EnrollmentService enrollmentService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EnrollmentDto> findAll() {
		return enrollmentService.findAll();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EnrollmentDto findById(@PathVariable("id") Long id) {
		return enrollmentService.findById(id);
	}

}
