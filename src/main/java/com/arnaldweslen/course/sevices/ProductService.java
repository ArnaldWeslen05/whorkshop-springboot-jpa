package com.arnaldweslen.course.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnaldweslen.course.entites.Product;
import com.arnaldweslen.course.respositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository product;
	
	
	
	public List<Product> findAll(){
		return product.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = product.findById(id);
		return obj.get();
	}
}
