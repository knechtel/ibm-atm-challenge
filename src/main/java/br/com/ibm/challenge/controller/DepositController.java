package br.com.ibm.challenge.controller;

import br.com.ibm.challenge.DTO.AccountDTO;
import br.com.ibm.challenge.DTO.DepositDTO;
import br.com.ibm.challenge.domain.Account;

import br.com.ibm.challenge.domain.Deposit;
import br.com.ibm.challenge.service.AccountService;
import br.com.ibm.challenge.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/deposit")
public class DepositController {

    @Autowired
    private DepositService service;


    @Autowired
    private AccountService serviceAcc;

    @RequestMapping
    public ResponseEntity<?> doDeposit(@RequestBody DepositDTO depositDTO) {

        Account account = depositDTO.getTargetAccount().getAccount(depositDTO.getTargetAccount());

        if(account.getId() != null) {
            account  = serviceAcc.create(account);
        }else{
            account = serviceAcc.FindByID(account.getId()).orElse(null);
        }

        Deposit d = depositDTO.getDeposit(depositDTO);
        d.setTargetAccoun(account);


       return ResponseEntity.ok(service.create(d));
    }

}
