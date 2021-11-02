package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="TELLER")
public class Teller {

  @Id
  @GeneratedValue
  @Column(name="ID")
  private Long id;

  @Basic(optional = false)
  @Column(name ="FIRSTNAME", length = 50)
  private String firstname;

  @Basic(optional = false)
  @Column(name ="LASTNAME", length = 50)
  private String lastname;

  @Basic(optional = false)
  @Column(name ="VAT_NUMBER", unique = true)
  private String vatNumber;

  @ManyToOne
  @JoinColumn(name = "BANK_ID")
  private Bank bank;

  @ManyToMany(mappedBy = "tellers")
  private List<Customer> customers;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }
}
