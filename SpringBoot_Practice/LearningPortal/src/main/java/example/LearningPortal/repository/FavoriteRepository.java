package example.learningportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.learningportal.entity.FavoriteEntity;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity,Long>{

}
