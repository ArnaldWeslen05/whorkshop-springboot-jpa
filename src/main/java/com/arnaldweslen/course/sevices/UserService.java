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
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		uptadeData(entity ,obj);
		return repository.save(entity);
	}

	private void uptadeData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setFone(obj.getFone());
		
	}
}
