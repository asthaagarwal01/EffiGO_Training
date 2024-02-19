package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.LearningPortal.entity.FavoriteEntity;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity,Long>{

}
