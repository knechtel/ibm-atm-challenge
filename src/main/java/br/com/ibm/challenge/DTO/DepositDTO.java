package br.com.ibm.challenge.DTO;

import br.com.ibm.challenge.domain.Deposit;
import br.com.ibm.challenge.domain.TypeDeposit;

public class DepositDTO {

    private Double value;
    private AccountDTO targetAccount;
    private TypeDeposit typeDeposit;


    public Deposit getDeposit(DepositDTO dto){
       Deposit d =  new Deposit();
       d.setValue(dto.getValue());
       d.setTypeDeposit(dto.getTypeDeposit());
       return d;
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

    public TypeDeposit getTypeDeposit() {
        return typeDeposit;
    }

    public void setTypeDeposit(TypeDeposit typeDeposit) {
        this.typeDeposit = typeDeposit;
    }
}
