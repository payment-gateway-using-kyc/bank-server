package com.bank.fastbankingapplication.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_user_info")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long user_id;
    @NotEmpty(message = "The First name field cannot be empty")
    @Size(min=3, message = "The First name field must greater that 3 characters")
    private String first_name;
    @NotEmpty(message = "The Last name field cannot be empty")
    @Size(min=3, message = "The First name field must greater that 3 characters")
    private String last_name;
    @Email
    @NotEmpty
    @Pattern(regexp = "([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})", message = "Please Enter a Valid Email")
    private String email;
    @NotEmpty
    @NotNull
    private String password;
    private String token;
    private String code;
    private boolean verified;
    private LocalDate verified_at;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime update_at;

}
