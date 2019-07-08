package br.com.ibm.challenge.DTO;

import br.com.ibm.challenge.domain.Account;

public class AccountDTO {

    private String bankName;
    private String accountNumber;
    public Account getAccount(AccountDTO dto){
        Account a =  new Account();
        a.setBankName(dto.getBankName());
        a.setAccountNumber(dto.getAccountNumber());
        return a;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
