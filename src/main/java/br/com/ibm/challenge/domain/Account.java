package br.com.ibm.challenge.domain;

import br.com.ibm.challenge.DTO.AccountDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Account implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String accountNumber;
    private String bankName;
    @OneToMany
    private List<Transfer> listTransfer;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public List<Transfer> getListTransfer() {
        return listTransfer;
    }

    public void setListTransfer(List<Transfer> listTransfer) {
        this.listTransfer = listTransfer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
