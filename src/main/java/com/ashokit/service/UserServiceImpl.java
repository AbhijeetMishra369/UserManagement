package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepo;

	@Override
	public void registerUser(User user)
	{
		userRepo.save(user);

	}

}
