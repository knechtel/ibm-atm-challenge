package br.com.ibm.challenge.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Transfer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double value;
    @OneToOne
    private Account sourceAccount;
    @OneToOne
    private Account targetAccount;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(Account targetAccount) {
        this.targetAccount = targetAccount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "value=" + value +
                ", sourceAccount=" + sourceAccount +
                ", targetAccount=" + targetAccount +
                '}';
    }
}
