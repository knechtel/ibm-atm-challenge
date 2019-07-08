package br.com.ibm.challenge.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Deposit implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double value;
    private TypeDeposit typeDeposit;


    @OneToOne
    private Account targetAccoun;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public Account getTargetAccoun() {
        return targetAccoun;
    }

    public void setTargetAccoun(Account targetAccoun) {
        this.targetAccoun = targetAccoun;
    }

    public TypeDeposit getTypeDeposit() {
        return typeDeposit;
    }

    public void setTypeDeposit(TypeDeposit typeDeposit) {
        this.typeDeposit = typeDeposit;
    }
}
