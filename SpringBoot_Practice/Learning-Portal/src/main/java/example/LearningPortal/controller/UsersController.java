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

import example.LearningPortal.entity.UsersEntity;
import example.LearningPortal.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	private final UsersService user;
	@Autowired
	public UsersController(UsersService user)
	{
		this.user=user;
	}
	
	@GetMapping
	public List<UsersEntity>findAllUsers()
	{
		
        return user.findAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<UsersEntity>findById(Long id)
	{
		
		return user.findById(id);
	}
	
	@PostMapping
	public UsersEntity saveUsers(UsersEntity userToSave) {
		
		return user.saveUsers(userToSave);
	}
	
	@PutMapping("/{id}")
	public UsersEntity updateUsers(@PathVariable Long id, @RequestBody UsersEntity userToUpdate) {
		
		return user.updateUsers(id,userToUpdate);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUsers(Long id)
	{
		user.deleteUsers(id);
	}
}
