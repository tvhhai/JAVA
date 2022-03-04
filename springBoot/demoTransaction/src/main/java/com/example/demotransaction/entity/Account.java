package com.example.demotransaction.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="account")
@Table(name="account")
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private Long balance;
    private AccountState state;
    public Account(String owner, Long balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = AccountState.ACTIVE;
    }
}
