package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.AccountBaseDao;
import it.unical.inf.asd.bank.data.services.AccountBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBaseServiceImpl implements AccountBaseService {

  @Autowired
  private AccountBaseDao accountBaseDao;

}
