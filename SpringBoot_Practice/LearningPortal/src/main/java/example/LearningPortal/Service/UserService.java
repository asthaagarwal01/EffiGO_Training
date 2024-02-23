package example.learningportal.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.learningportal.dto.UserDto;
import example.learningportal.entity.UserEntity;
import example.learningportal.mapper.UserMapper;
import example.learningportal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	@Autowired
	UserRepository userRepository;

	Logger logger = LoggerFactory.getLogger(getClass());

	public List<UserDto> findAllUsers() {
		List<UserEntity> userEntities = userRepository.findAll();
		return userMapper.toDto(userEntities);
	}

	public UserDto findById(Long id) {

		Optional<UserEntity> userOptional = userRepository.findById(id);
		if (userOptional.isPresent()) {

			UserEntity user = userOptional.get();
			return userMapper.toDto(user);
		} else {
			logger.error("User with id {} not found", id);
			return null;
		}
	}

	public UserDto saveUsers(UserDto user) {
		UserEntity userEntity = userMapper.toEntity(user);
		userRepository.save(userEntity);
		return userMapper.toDto(userEntity);
	}

	public UserDto updateUsers(UserDto updatedUser) {
		Logger logger = LoggerFactory.getLogger(getClass());
		UserEntity userEntity = userMapper.toEntity(updatedUser);

		Optional<UserEntity> existingUserOptional = userRepository.findById(userEntity.getUserId());
		if (existingUserOptional.isPresent()) {

			userEntity = userRepository.save(userEntity);
		} else {
			logger.error("User with id {} not found", userEntity.getUserId());
			throw new RuntimeException("User with id " + userEntity.getUserId() + " not found");
		}
		return userMapper.toDto(userEntity);
	}

	public void deleteUsers(Long id) {
		Optional<UserEntity> userOptional = userRepository.findById(id);
		if (userOptional.isPresent()) {
			UserEntity user = userOptional.get();
			userRepository.delete(user);
		} else {
			logger.error("User with id {} not found", id);
			throw new RuntimeException("User with id " + id + " not found");
		}
	}
}
