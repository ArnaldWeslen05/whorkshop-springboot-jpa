package com.arnaldweslen.course.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnaldweslen.course.entites.User;
import com.arnaldweslen.course.respositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();  
	}
	
	public User findById(Long id) {
		Optional<User> obj =  Optional.empty();
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
