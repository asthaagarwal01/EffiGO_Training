package example.LearningPortal.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.FavouriteEntity;
import example.LearningPortal.repository.FavouriteRepository;
import example.LearningPortal.service.FavouriteService;

@Service
class FavouriteServiceimpl implements FavouriteService{
	private final FavouriteRepository favrepo;
	public FavouriteServiceimpl(FavouriteRepository favouriterepo) {
		this.favrepo = favouriterepo;
	}
	
	@Override
    public List<FavouriteEntity> findFavourites() {
        return favrepo.findAll();
    }
	
	@Override
	public FavouriteEntity addCourseToFavourites(FavouriteEntity favouriteEntity) {
		favouriteEntity.setCreatedOn(LocalDateTime.now());
		favouriteEntity.setUpdatedOn(LocalDateTime.now());
		return favrepo.save(favouriteEntity);
	}
	
	@Override
	public void removeFromFavourites(Long id) {
		favrepo.deleteById(id);
	}
}
