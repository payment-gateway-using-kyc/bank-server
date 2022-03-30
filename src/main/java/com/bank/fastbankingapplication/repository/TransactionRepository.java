package com.bank.fastbankingapplication.repository;

import com.bank.fastbankingapplication.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
