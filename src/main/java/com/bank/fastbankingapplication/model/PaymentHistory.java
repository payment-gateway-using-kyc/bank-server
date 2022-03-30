package com.bank.fastbankingapplication.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_payment_history")
@AllArgsConstructor
@NoArgsConstructor
public class PaymentHistory {

    @Id
    private Long payment_id;
    private Long account_id;
    private Long user_id;
    private String beneficiary;
    private String beneficiary_acc_no;
    private double amount;
    private String status;
    private String reference_no;
    private String reason_code;
    private LocalDateTime created_at;
}
