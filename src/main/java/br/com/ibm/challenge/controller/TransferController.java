package br.com.ibm.challenge.controller;

import br.com.ibm.challenge.DTO.TransferDTO;
import br.com.ibm.challenge.domain.Account;
import br.com.ibm.challenge.domain.Transfer;
import br.com.ibm.challenge.service.AccountService;
import br.com.ibm.challenge.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/transfer")
public class TransferController {

    @Autowired
    private TransferService service;

    @Autowired
    private AccountService serviceAccount;


    @RequestMapping
    public ResponseEntity<?> doTransfer(@RequestBody TransferDTO tDTO) {

        return ResponseEntity.ok(service.create(transfConfig(tDTO)));
    }

    public Transfer transfConfig(TransferDTO tDTO) {
        Account aSource = tDTO.getSourceAccount().getAccount(tDTO.getSourceAccount());

        if (aSource.getId() == null) {
            aSource = serviceAccount.create(aSource);
        } else {
            aSource = serviceAccount.FindByID(aSource.getId()).orElse(null);
        }

        Account aTarget = tDTO.getTargetAccount().getAccount(tDTO.getTargetAccount());
        if (aTarget.getId() == null) {
            serviceAccount.create(aTarget);
        } else {
            serviceAccount.FindByID(aTarget.getId()).orElse(null);
        }

        Transfer t = tDTO.getTransfer(tDTO);
        t.setSourceAccount(aSource);
        t.setTargetAccount(aTarget);


        return t;
    }
}
