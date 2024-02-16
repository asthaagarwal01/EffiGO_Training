package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LearningPortal.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
