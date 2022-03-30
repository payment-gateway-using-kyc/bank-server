package com.bank.fastbankingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentHistoryRepository extends JpaRepository<PaymentRepository,Long> {
}
