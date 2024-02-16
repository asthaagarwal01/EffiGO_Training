package example.LearningPortal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import example.LearningPortal.dto.FavoriteDto;
import example.LearningPortal.entity.FavoriteEntity;

@Mapper(componentModel = "spring", uses = {UserMapper.class, CourseMapper.class})
public interface FavoriteMapper {

    FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);

    @Mapping(source = "favorite.learner.userId", target = "learnerId")
    FavoriteDto favoriteToFavoriteDTO(FavoriteEntity favorite);

    FavoriteDto favoriteDTOToFavorite(FavoriteDto favoriteDTO);
}