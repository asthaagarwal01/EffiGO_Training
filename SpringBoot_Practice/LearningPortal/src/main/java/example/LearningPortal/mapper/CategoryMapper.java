package example.LearningPortal.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import example.LearningPortal.dto.CategoryDto;
import example.LearningPortal.entity.CategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDto, CategoryEntity> {

	CategoryDto toDto(CategoryEntity e);

	CategoryEntity toEntity(CategoryDto d);

	List<CategoryDto> toDto(List<CategoryEntity> elist);

	List<CategoryEntity> toEntity(List<CategoryDto> dlist);

}
