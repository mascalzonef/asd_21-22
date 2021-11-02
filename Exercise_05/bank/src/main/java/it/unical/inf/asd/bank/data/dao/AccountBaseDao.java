package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Account;
import it.unical.inf.asd.bank.data.entities.AccountBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBaseDao extends JpaRepository<AccountBase, Long> {
}
