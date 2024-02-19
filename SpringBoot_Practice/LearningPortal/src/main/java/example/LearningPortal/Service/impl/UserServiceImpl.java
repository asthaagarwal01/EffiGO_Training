package example.LearningPortal.Service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.Service.UserService;
import example.LearningPortal.entity.UserEntity;
import example.LearningPortal.repository.UserRepository;
import example.LearningPortal.util.PasswordHashUtil;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository usersrepo;

	public List<UserEntity> findAllUsers() {
		return usersrepo.findAll();
	}

	public Optional<UserEntity> findById(Long id) {
		return usersrepo.findById(id);
	}

	public UserEntity saveUsers(UserEntity user) {
		String plainPassword = user.getPassword();
		String hashedPassword = PasswordHashUtil.hashPassword(plainPassword);
		user.setPassword(hashedPassword);
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());
		return usersrepo.save(user);
	}

	public UserEntity updateUsers(Long id, UserEntity user) {
		String plainPassword = user.getPassword();
		if (plainPassword != null) {
			String hashedPassword = PasswordHashUtil.hashPassword(plainPassword);
			user.setPassword(hashedPassword);
		}
		user.setUpdatedOn(LocalDateTime.now());
		return usersrepo.save(user);
	}

	public void deleteUsers(Long id) {
		usersrepo.deleteById(id);
	}

}
