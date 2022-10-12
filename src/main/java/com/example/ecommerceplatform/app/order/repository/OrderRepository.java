package com.example.ecommerceplatform.app.order.repository;

import com.example.ecommerceplatform.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}