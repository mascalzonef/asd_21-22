package it.unical.inf.asd.bank.data.services.impl;

import it.unical.inf.asd.bank.data.dao.BankDao;
import it.unical.inf.asd.bank.data.dao.CustomerDao;
import it.unical.inf.asd.bank.data.entities.Bank;
import it.unical.inf.asd.bank.data.entities.Customer;
import it.unical.inf.asd.bank.data.entities.Teller;
import it.unical.inf.asd.bank.data.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

  @Autowired
  private BankDao bankDao;

  @Autowired
  private CustomerDao customerDao;

  @Override
  public Optional<List<Teller>> getAllTellersFromBankName(String bankName) {
    Bank bank = bankDao.findByName(bankName);
    if(bank != null)
      return Optional.of(bank.getTellers());
    return Optional.empty();
  }

  @Override
  public List<Bank> countCosenzaBank() {
    String cosenzaLocation = "Cosenza";
    Integer numCosenzaBank = bankDao.countByLocation(cosenzaLocation);
    Optional<List<Bank>> banksOpt = bankDao.findAllByLocation(cosenzaLocation);

    if(banksOpt.isPresent()) {
      List<Bank> banks = banksOpt.get();
      for (Bank bank: banks) {
        bank.numCosenzaBank = numCosenzaBank;
      }
      return banks;
    }
    return null;
  }

  @Override
  @Transactional
  public void deleteAllCustomer(Long bankId) {
    Bank bank = bankDao.findById(bankId).orElseThrow(()->new RuntimeException("ERROR"));
    List<Customer> customers = bank.getCustomers();
    for (Customer customer: customers) {
      customerDao.delete(customer);
    }
  }

}
