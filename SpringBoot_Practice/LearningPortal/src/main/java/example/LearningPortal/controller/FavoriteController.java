package example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.FavoriteService;
import example.LearningPortal.dto.FavoriteDto;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
	@Autowired
	private FavoriteService favoriteService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FavoriteDto> findFavourites() {
		return favoriteService.findFavourites();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FavoriteDto addCourseToFavourites(@RequestBody FavoriteDto favourite) {
		return favoriteService.addCourseToFavourites(favourite);
	}

	@DeleteMapping("/{id}")
	public void removeFromFavourites(@PathVariable Long id) {
		favoriteService.removeFromFavourites(id);
	}
}
