package br.com.ibm.challenge.controller;

import br.com.ibm.challenge.DTO.WithdrawDTO;
import br.com.ibm.challenge.config.Util;
import br.com.ibm.challenge.domain.Banknote;
import br.com.ibm.challenge.domain.Withdraw;
import br.com.ibm.challenge.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class WithdrawController {

    @Autowired
    private WithdrawService service;

    @RequestMapping("/withdraw")
    @ResponseBody
    public List<Banknote> doDeposit(@RequestBody WithdrawDTO wDTO) {

        service.create(wDTO.getWithdraw(wDTO));


        return null;//Util.getBanknote(0.00);
    }
}
