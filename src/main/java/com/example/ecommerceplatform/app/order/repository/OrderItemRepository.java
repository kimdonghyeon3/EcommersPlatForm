package com.example.ecommerceplatform.app.order.repository;

import com.example.ecommerceplatform.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}