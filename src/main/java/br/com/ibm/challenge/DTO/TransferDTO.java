package br.com.ibm.challenge.DTO;

import br.com.ibm.challenge.domain.Account;
import br.com.ibm.challenge.domain.Transfer;

public class TransferDTO {

    private Double value;

    private AccountDTO sourceAccount;

    private AccountDTO targetAccount;


    public Transfer getTransfer(TransferDTO tdto) {
        Transfer t = new Transfer();
        t.setValue(tdto.value);

        if (t.getSourceAccount() == null) {
            Account a = new Account();
            t.setSourceAccount(a);
        }
        if (t.getTargetAccount() == null) {
            Account a = new Account();
            t.setTargetAccount(a);
        }
        t.setSourceAccount(tdto.getSourceAccount().getAccount(tdto.sourceAccount));
        t.setTargetAccount(tdto.getTargetAccount().getAccount(tdto.targetAccount));
        return t;
    }

    public AccountDTO getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(AccountDTO sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public AccountDTO getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(AccountDTO targetAccount) {
        this.targetAccount = targetAccount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
