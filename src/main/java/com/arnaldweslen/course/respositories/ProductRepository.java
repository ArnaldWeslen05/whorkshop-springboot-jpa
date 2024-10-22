package com.arnaldweslen.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaldweslen.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
