package example.LearningPortal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.FavoriteEntity;

@Service
public interface FavouriteService {
	List<FavoriteEntity> findFavourites();

	FavoriteEntity addCourseToFavourites(FavoriteEntity favouriteEntity);

	void removeFromFavourites(Long favorite_id);
}
