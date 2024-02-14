package example.LearningPortal.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.LearningPortal.entity.UsersEntity;
import example.LearningPortal.repository.UsersRepository;
import example.LearningPortal.service.UsersService;

@Service
public class UsersServiceimpl implements UsersService{
	
	private final UsersRepository usersrepo;
	
	@Autowired
	public UsersServiceimpl(UsersRepository userrepo)
	{
		this.usersrepo=userrepo;
	}
	
	@Override
	public List<UsersEntity>findAllUsers()
	{
		return usersrepo.findAll();
	}
	
	@Override
	public Optional<UsersEntity>findById(Long id)
	{
		return usersrepo.findById(id);
	}
	
	@Override
	public UsersEntity saveUsers(UsersEntity user) {
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());
		return usersrepo.save(user);
	}
	
	@Override
	public UsersEntity updateUsers(Long id,UsersEntity user) {
		user.setUpdatedOn(LocalDateTime.now());
		return usersrepo.save(user);
	}
	
	public void deleteUsers(Long id)
	{
		usersrepo.deleteById(id);
	}

}
