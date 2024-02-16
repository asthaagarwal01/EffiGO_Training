package example.LearningPortal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import example.LearningPortal.dto.CategoryDto;
import example.LearningPortal.entity.CategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto categoryToCategoryDTO(CategoryEntity category);

    CategoryEntity categoryDTOToCategory(CategoryDto categoryDTO);
}
