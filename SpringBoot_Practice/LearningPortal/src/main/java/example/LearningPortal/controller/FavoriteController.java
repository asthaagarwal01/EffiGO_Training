package example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.impl.FavoriteServiceImpl;
import example.LearningPortal.entity.FavoriteEntity;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
	@Autowired
	private FavoriteServiceImpl favoriteService;

	@GetMapping
	public List<FavoriteEntity> findFavourites() {
		return favoriteService.findFavourites();
	}

	@PostMapping
	public FavoriteEntity addCourseToFavourites(@RequestBody FavoriteEntity favouriteEntity) {
		return favoriteService.addCourseToFavourites(favouriteEntity);
	}

	@DeleteMapping("/{id}")
	public void removeFromFavourites(@PathVariable Long id) {
		favoriteService.removeFromFavourites(id);
	}
}
