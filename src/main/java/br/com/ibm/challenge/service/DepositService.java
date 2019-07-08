package br.com.ibm.challenge.service;

import br.com.ibm.challenge.domain.Deposit;
import br.com.ibm.challenge.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositService {

    @Autowired
    private DepositRepository rep;

    public Deposit create(Deposit d){
        return rep.save(d);

    }
}
