package example.learningportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.learningportal.dto.FavoriteDto;
import example.learningportal.entity.FavoriteEntity;
import example.learningportal.mapper.FavoriteMapper;
import example.learningportal.repository.FavoriteRepository;

@Service
public class FavoriteService {

	@Autowired
	FavoriteMapper favoriteMapper;

	@Autowired
	FavoriteRepository favoriteRepository;

	public List<FavoriteDto> findFavourites() {
		List<FavoriteEntity> favoriteEntities = favoriteRepository.findAll();
		return favoriteMapper.toDto(favoriteEntities);
	}

	public FavoriteDto addCourseToFavourites(FavoriteDto favorite) {
		FavoriteEntity favoriteEntity = favoriteMapper.toEntity(favorite);
		favoriteRepository.save(favoriteEntity);
		return favorite;//favoriteMapper.toDto(favoriteEntity);
	}

	public void removeFromFavourites(Long id) {
		Optional<FavoriteEntity> favoriteOptional = favoriteRepository.findById(id);
		FavoriteEntity favorite = favoriteOptional.get();
		favoriteRepository.delete(favorite);
	}
}
