package it.unical.inf.asd.bank.data.services;

import it.unical.inf.asd.bank.data.entities.Bank;
import it.unical.inf.asd.bank.data.entities.Teller;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface BankService {

  Optional<List<Teller>> getAllTellersFromBankName(String bankName);

  List<Bank> countCosenzaBank();

  @Transactional
  void deleteAllCustomer(Long bankId);
}
