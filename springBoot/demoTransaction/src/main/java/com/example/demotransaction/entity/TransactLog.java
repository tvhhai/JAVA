package com.example.demotransaction.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity(name="transactlog")
@Table(name="transactlog")
@Getter
@Setter
@NoArgsConstructor
public class TransactLog {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Account accountFrom;

    @ManyToOne(fetch = FetchType.EAGER)
    private Account accountTo;

    private long amount;

    private Date createdOn;

    public TransactLog (Account accountFrom, Account accountTo, Long amount, Date createdOn){
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.createdOn = createdOn;
    }
}
