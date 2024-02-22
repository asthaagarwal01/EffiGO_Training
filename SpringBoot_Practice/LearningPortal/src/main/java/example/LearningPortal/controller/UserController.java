package example.learningportal.controller;

import org.springframework.http.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.learningportal.dto.UserDto;
import example.learningportal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService user;

	@GetMapping(value="/getAllUsers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> findAllUsers() {
		return user.findAllUsers();
	}

	@GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto findById(@PathVariable("id") Long id) {
		return user.findById(id);
	}

	@PostMapping(value="/saveUsers",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto saveUsers(@RequestBody UserDto userToSave) {
		return user.saveUsers(userToSave);
	}

	@PutMapping(value="/updateUsers",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto updateUsers(@RequestBody UserDto userToUpdate) {

		return user.updateUsers(userToUpdate);
	}

	@DeleteMapping("/deleteUsers/{id}")
	public void deleteUsers(@PathVariable("id") Long id) {
		user.deleteUsers(id);
	}
}

