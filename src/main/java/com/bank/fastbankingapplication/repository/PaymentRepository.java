package com.bank.fastbankingapplication.repository;

import com.bank.fastbankingapplication.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
