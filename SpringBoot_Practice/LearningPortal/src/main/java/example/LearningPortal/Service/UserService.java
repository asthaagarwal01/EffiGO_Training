package example.LearningPortal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.LearningPortal.entity.UserEntity;

@Service
public interface UserService {
	List<UserEntity> findAllUsers();

	Optional<UserEntity> findById(Long id);

	UserEntity saveUsers(UserEntity user);

	UserEntity updateUsers(Long id, UserEntity updateduser);

	void deleteUsers(Long id);
}
