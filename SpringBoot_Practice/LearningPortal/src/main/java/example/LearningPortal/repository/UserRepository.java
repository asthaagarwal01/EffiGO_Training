package example.LearningPortal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import example.LearningPortal.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	Optional<UserEntity> findByUsername(String username);
}
