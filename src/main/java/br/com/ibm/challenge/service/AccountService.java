package br.com.ibm.challenge.service;

import br.com.ibm.challenge.domain.Account;
import br.com.ibm.challenge.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository rep;

    public Account create(Account a){
        return rep.save(a);

    }
    public Optional<Account> FindByID(Integer id){
        return rep.findById(id);

    }
}
