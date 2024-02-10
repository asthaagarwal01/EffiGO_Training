package example.LearningPortal.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.entity.UsersEntity;
import example.LearningPortal.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository userepo;

	public UsersEntity saveUser(UsersEntity user) {
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());
		return UsersRepository.save(user);
	}

}
