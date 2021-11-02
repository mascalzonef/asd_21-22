package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.LoanDao;
import it.unical.inf.asd.bank.data.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService {

  @Autowired
  private LoanDao loanDao;
}
