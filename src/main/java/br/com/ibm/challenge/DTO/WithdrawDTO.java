package br.com.ibm.challenge.DTO;

import br.com.ibm.challenge.domain.Withdraw;

public class WithdrawDTO {
    private Double value;

    public Withdraw getWithdraw(WithdrawDTO wDTO){
        Withdraw w = new Withdraw();
        w.setValue(value);
        return  w;
    }

}
