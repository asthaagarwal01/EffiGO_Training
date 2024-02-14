package example.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import example.LearningPortal.entity.UsersEntity;

public interface UsersService {
	List<UsersEntity>findAllUsers();
	Optional<UsersEntity>findById(Long id);
	UsersEntity saveUsers(UsersEntity user);
	UsersEntity updateUsers(Long id,UsersEntity updateduser);
	void deleteUsers(Long id);

}
