package br.com.ibm.challenge.repository;

import br.com.ibm.challenge.domain.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithdrawRepository extends JpaRepository<Withdraw,Integer> {
}
