package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Customer;
import it.unical.inf.asd.bank.data.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDao extends JpaRepository<Loan, Long> {
}
