package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.services.TellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TellerServiceImpl implements TellerService {

  @Autowired
  private TellerService tellerService;
}
