package example.LearningPortal.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.FavoriteEntity;

@Service
public interface FavoriteService {
	List<FavoriteEntity> findFavourites();

	FavoriteEntity addCourseToFavourites(FavoriteEntity favouriteEntity);

	void removeFromFavourites(Long favorite_id);
}
