package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Account;
import it.unical.inf.asd.bank.data.entities.AccountObs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountObsDao extends JpaRepository<AccountObs, Long> {
}
