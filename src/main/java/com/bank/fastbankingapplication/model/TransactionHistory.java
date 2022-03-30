package com.bank.fastbankingapplication.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_transaction_history")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistory {

    @Id
    private Long transaction_id;
    private Long account_id;
    private Long user_id;
    private String transaction_type;
    private double amount;
    private String  source;
    private String  status;
    private String  reason_code;
    private LocalDateTime created_at;
}
