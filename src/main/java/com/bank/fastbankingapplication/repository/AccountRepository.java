package com.bank.fastbankingapplication.repository;

import com.bank.fastbankingapplication.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
