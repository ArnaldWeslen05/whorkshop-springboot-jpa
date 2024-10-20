package com.arnaldweslen.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaldweslen.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
