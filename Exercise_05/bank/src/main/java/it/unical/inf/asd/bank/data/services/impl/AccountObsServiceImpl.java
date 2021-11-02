package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.AccountBaseDao;
import it.unical.inf.asd.bank.data.dao.AccountObsDao;
import it.unical.inf.asd.bank.data.services.AccountObsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountObsServiceImpl implements AccountObsService {

  @Autowired
  private AccountObsDao accountObsDao;

}
