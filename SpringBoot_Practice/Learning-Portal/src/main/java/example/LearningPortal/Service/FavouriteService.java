package example.LearningPortal.service;

import java.util.List;

import example.LearningPortal.entity.FavouriteEntity;

public interface FavouriteService{
	List<FavouriteEntity> findFavourites();
	FavouriteEntity addCourseToFavourites(FavouriteEntity favouriteEntity);
    void removeFromFavourites(Long favorite_id);
    
}
