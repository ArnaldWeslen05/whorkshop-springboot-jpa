package com.arnaldweslen.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaldweslen.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
