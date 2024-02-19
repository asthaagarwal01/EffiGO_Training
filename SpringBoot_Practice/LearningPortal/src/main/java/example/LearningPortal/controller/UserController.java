package example.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.LearningPortal.Service.UserService;
import example.LearningPortal.entity.UserEntity;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService user;

	@GetMapping
	public List<UserEntity> findAllUsers() {

		return user.findAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<UserEntity> findById(@PathVariable("id") Long id) {

		return user.findById(id);
	}

	@PostMapping
	public UserEntity saveUsers(@RequestBody UserEntity userToSave) {

		return user.saveUsers(userToSave);
	}

	@PutMapping("/{id}")
	public UserEntity updateUsers(@PathVariable Long id, @RequestBody UserEntity userToUpdate) {

		return user.updateUsers(id, userToUpdate);
	}

	@DeleteMapping("/{id}")
	public void deleteUsers(@PathVariable("id") Long id) {
		user.deleteUsers(id);
	}
}
