package com.example.ecommerceplatform.app.cash.repository;

import com.example.ecommerceplatform.app.cash.entity.CashLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashLogRepository extends JpaRepository<CashLog, Long> {
}