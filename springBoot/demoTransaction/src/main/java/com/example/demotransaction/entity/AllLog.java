package com.example.demotransaction.entity;

import com.example.demotransaction.exception.BankErrorCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name="alllog")
@Table(name="alllog")
@Getter
@Setter
@NoArgsConstructor
public class AllLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long fromID;

    private long toID;

    private long amount;

    private BankErrorCode resultCode;

    private String detail;

    private Date createdOn;

    public AllLog (long fromID, long toID, Long amount,
                   BankErrorCode resultCode, String detail){
        this.fromID = fromID;
        this.toID = toID;
        this.amount = amount;
        this.resultCode = resultCode;
        this.detail = detail;
        this.createdOn = new Date();
    }
}
