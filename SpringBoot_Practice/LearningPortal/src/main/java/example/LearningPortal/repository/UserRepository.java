package example.learningportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import example.learningportal.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	Optional<UserEntity> findByUsername(String username);

	Optional<UserEntity> findById(Long user_id);

}
