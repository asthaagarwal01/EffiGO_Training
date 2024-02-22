//package example.LearningPortal.mapper;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//
//import example.LearningPortal.dto.FavoriteDto;
//import example.LearningPortal.entity.FavoriteEntity;
//
//@Mapper(componentModel = "spring", uses = { UserMapper.class, CourseMapper.class })
//public interface FavoriteMapper {
//
//	FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);
//
//	@Mapping(source = "favorite.learner.userId", target = "learnerId")
//	FavoriteDto favoriteToFavoriteDTO(FavoriteEntity favorite);
//
//	FavoriteDto favoriteDTOToFavorite(FavoriteDto favoriteDTO);
//}

package example.learningportal.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import example.learningportal.dto.FavoriteDto;
import example.learningportal.entity.FavoriteEntity;

@Mapper(componentModel = "spring")
public interface FavoriteMapper extends EntityMapper<FavoriteDto, FavoriteEntity> {
	FavoriteDto toDto(FavoriteEntity e);

	FavoriteEntity toEntity(FavoriteDto d);

	List<FavoriteDto> toDto(List<FavoriteEntity> elist);

	List<FavoriteEntity> toEntity(List<FavoriteDto> dlist);
}