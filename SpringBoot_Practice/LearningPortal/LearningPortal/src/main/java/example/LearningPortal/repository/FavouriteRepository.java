package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LearningPortal.entity.FavoriteEntity;

@Repository
public interface FavouriteRepository extends JpaRepository<FavoriteEntity,Long> {

}
