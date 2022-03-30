package com.bank.fastbankingapplication.repository;

import com.bank.fastbankingapplication.model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory,Long> {
}
