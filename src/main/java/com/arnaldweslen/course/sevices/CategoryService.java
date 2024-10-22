package com.arnaldweslen.course.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnaldweslen.course.entites.Category;
import com.arnaldweslen.course.respositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository category;

	public List<Category> findAll() {
		return category.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj =  category.findById(id);
		return obj.get();
	}
}
