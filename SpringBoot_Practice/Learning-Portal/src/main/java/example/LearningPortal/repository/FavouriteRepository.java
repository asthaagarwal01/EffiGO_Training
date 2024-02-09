package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LearningPortal.entity.FavouriteEntity;

@Repository
public interface FavouriteRepository extends JpaRepository<FavouriteEntity,Long> {

}
