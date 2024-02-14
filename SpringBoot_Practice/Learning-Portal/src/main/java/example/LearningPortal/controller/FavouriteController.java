package example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import example.LearningPortal.entity.FavouriteEntity;
import example.LearningPortal.service.FavouriteService;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {

    private final FavouriteService favouriteService;

    @Autowired
    public FavouriteController(FavouriteService favouriteService) {
        this.favouriteService = favouriteService;
    }

    @GetMapping
    public List<FavouriteEntity> findFavourites() {
        return favouriteService.findFavourites();
    }

    @PostMapping
    public FavouriteEntity addCourseToFavourites(@RequestBody FavouriteEntity favouriteEntity) {
        return favouriteService.addCourseToFavourites(favouriteEntity);
    }

    @DeleteMapping("/{id}")
    public void removeFromFavourites(@PathVariable Long id) {
        favouriteService.removeFromFavourites(id);
    }
}
