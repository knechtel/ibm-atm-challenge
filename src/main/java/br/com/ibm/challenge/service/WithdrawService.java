package br.com.ibm.challenge.service;

import br.com.ibm.challenge.domain.Withdraw;
import br.com.ibm.challenge.repository.WithdrawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawService {
    @Autowired
    private WithdrawRepository rep;

    public Withdraw create(Withdraw w){
        return rep.save(w);

    }
}
