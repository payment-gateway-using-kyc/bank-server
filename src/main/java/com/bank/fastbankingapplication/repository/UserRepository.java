package com.bank.fastbankingapplication.repository;

import com.bank.fastbankingapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
