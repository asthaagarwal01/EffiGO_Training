package example.LearningPortal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import example.LearningPortal.dto.CourseDto;
import example.LearningPortal.entity.CourseEntity;

@Mapper(componentModel = "spring", uses = { CategoryMapper.class, UserMapper.class })
public interface CourseMapper {
	CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

	@Mapping(source = "course.author.userId", target = "authorId")
	@Mapping(source = "course.category.name", target = "category")
	CourseDto courseToCourseDTO(CourseEntity course);

	CourseEntity courseDTOToCourse(CourseDto courseDTO);

}
