package br.com.ibm.challenge.service;

import br.com.ibm.challenge.domain.Transfer;
import br.com.ibm.challenge.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
    @Autowired
    private TransferRepository rep;
    public Transfer create(Transfer t) {
        return rep.save(t);
    }
}
