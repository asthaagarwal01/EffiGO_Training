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

import example.LearningPortal.entity.FavoriteEntity;
import example.LearningPortal.service.FavouriteService;

@RestController
@RequestMapping("/favorites")
public class FavouriteController {
	@Autowired
	private FavouriteService favouriteService;

	@GetMapping
	public List<FavoriteEntity> findFavourites() {
		return favouriteService.findFavourites();
	}

	@PostMapping
	public FavoriteEntity addCourseToFavourites(@RequestBody FavoriteEntity favouriteEntity) {
		return favouriteService.addCourseToFavourites(favouriteEntity);
	}

	@DeleteMapping("/{id}")
	public void removeFromFavourites(@PathVariable Long id) {
		favouriteService.removeFromFavourites(id);
	}
}
