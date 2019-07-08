package br.com.ibm.challenge.repository;

import br.com.ibm.challenge.domain.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<Deposit,Integer> {
}
