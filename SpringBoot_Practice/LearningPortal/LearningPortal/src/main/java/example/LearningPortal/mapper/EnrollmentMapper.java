package example.LearningPortal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import example.LearningPortal.dto.EnrollmentDto;
import example.LearningPortal.entity.EnrollmentEntity;

@Mapper(componentModel = "spring", uses = { UserMapper.class, CourseMapper.class })
public interface EnrollmentMapper {

	EnrollmentMapper INSTANCE = Mappers.getMapper(EnrollmentMapper.class);

	@Mapping(source = "enrollment.learner.userId", target = "learnerId")
	EnrollmentDto enrollmentToEnrollmentDTO(EnrollmentEntity enrollment);

	EnrollmentEntity enrollmentDTOToEnrollment(EnrollmentDto enrollmentDTO);
}