package it.unical.inf.asd.bank.data.services;

import it.unical.inf.asd.bank.data.entities.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> getByAge(Integer age);
}
