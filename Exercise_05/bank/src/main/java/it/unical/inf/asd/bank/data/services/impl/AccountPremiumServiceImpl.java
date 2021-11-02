package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.AccountPremiumDao;
import it.unical.inf.asd.bank.data.services.AccountPremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountPremiumServiceImpl implements AccountPremiumService {

  @Autowired
  private AccountPremiumDao accountPremiumDao;
}
