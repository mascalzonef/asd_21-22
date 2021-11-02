package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Loan;
import it.unical.inf.asd.bank.data.entities.Teller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TellerDao extends JpaRepository<Teller, Long> {
}
