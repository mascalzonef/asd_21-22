package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "BANK")
public class Bank {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Long id;

  @Basic(optional = false)
  @Column(name="NAME", unique = true)
  private String name;

  @Column(name="LOCATION")
  private String location;

  @OneToMany(mappedBy = "bank", fetch = FetchType.EAGER)
  private List<Customer> customers = new ArrayList<>();

  @OneToMany(mappedBy = "bank", fetch = FetchType.EAGER)
  private List<Teller> tellers = new ArrayList<>();

  @Transient
  public Integer numCosenzaBank;

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  public List<Teller> getTellers() {
    return tellers;
  }

  public void setTellers(List<Teller> tellers) {
    this.tellers = tellers;
  }


}
