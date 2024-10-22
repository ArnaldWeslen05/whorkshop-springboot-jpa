package com.arnaldweslen.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaldweslen.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
