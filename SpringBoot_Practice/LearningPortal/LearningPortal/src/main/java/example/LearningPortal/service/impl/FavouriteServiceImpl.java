package example.LearningPortal.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.entity.FavoriteEntity;
import example.LearningPortal.repository.FavouriteRepository;
import example.LearningPortal.service.FavouriteService;

@Service
public class FavouriteServiceImpl implements FavouriteService {
	@Autowired
	private FavouriteRepository favrepo;

	public List<FavoriteEntity> findFavourites() {
		return favrepo.findAll();
	}

	public FavoriteEntity addCourseToFavourites(FavoriteEntity favouriteEntity) {
		favouriteEntity.setCreatedOn(LocalDateTime.now());
		favouriteEntity.setUpdatedOn(LocalDateTime.now());
		return favrepo.save(favouriteEntity);
	}

	public void removeFromFavourites(Long id) {
		favrepo.deleteById(id);
	}
}
