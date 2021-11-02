package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.AccountDao;
import it.unical.inf.asd.bank.data.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountDao accountDao;
}
