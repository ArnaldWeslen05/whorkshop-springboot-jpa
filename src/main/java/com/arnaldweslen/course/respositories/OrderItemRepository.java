package com.arnaldweslen.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaldweslen.course.entites.OrderItem;
import com.arnaldweslen.course.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
