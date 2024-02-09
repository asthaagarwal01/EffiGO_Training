package example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LearningPortal.entity.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Long> {

}
