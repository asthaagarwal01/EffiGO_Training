package example.LearningPortal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.dto.UserDto;
import example.LearningPortal.entity.UserEntity;
import example.LearningPortal.mapper.UserMapper;
import example.LearningPortal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	@Autowired
	UserRepository userRepository;

	public List<UserDto> findAllUsers() {
		List<UserEntity> userEntities = userRepository.findAll();
		return userMapper.toDto(userEntities);
	}

	public UserDto findById(Long id) {
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();
		return userMapper.toDto(user);
	}

	public UserDto saveUsers(UserDto user) {
		UserEntity userEntity = userMapper.toEntity(user);
		userRepository.save(userEntity);
		return userMapper.toDto(userEntity);
	}

	public UserDto updateUsers(UserDto updateduser) {
		UserEntity userEntity = userMapper.toEntity(updateduser);
		userRepository.save(userEntity);
		return userMapper.toDto(userEntity);
	}

	public void deleteUsers(Long id) {
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();
		userRepository.delete(user);
	}
}
