package example.learningportal.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger logger = LoggerFactory.getLogger(getClass());

	public List<FavoriteDto> findFavourites() {
		List<FavoriteEntity> favoriteEntities = favoriteRepository.findAll();
		return favoriteMapper.toDto(favoriteEntities);
	}

	public FavoriteDto addCourseToFavourites(FavoriteDto favorite) {
		FavoriteEntity favoriteEntity = favoriteMapper.toEntity(favorite);
		favoriteRepository.save(favoriteEntity);
		return favorite;
	}

	public void removeFromFavourites(Long id) {
//		Optional<FavoriteEntity> favoriteOptional = favoriteRepository.findById(id);
//		FavoriteEntity favorite = favoriteOptional.get();
//		favoriteRepository.delete(favorite);
		
		Optional<FavoriteEntity> favoriteOptional = favoriteRepository.findById(id);
		if (favoriteOptional.isPresent()) {
		 FavoriteEntity user = favoriteOptional.get();
			favoriteRepository.delete(user);
		} else {
			logger.error("Favorite not found");
			throw new RuntimeException("Favorite not found");
		}
	}
	}

