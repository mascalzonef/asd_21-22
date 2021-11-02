package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name="CUSTOMER")
public class Customer {

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
  @Column(name ="FISCALCODE", unique = true, length = 16)
  private String fiscalcode;

  @Basic(optional = false)
  @Column(name ="ADDRESS", length = 100)
  private String address;

  @Basic(optional = false)
  @Column(name ="BIRTHDATE")
  private LocalDate birthdate;

  @Column(name="ACCT_NO")
  private Integer acctNo;

  @ManyToOne
  @JoinColumn(name="BANK_ID")
  private Bank bank;

  @OneToMany(mappedBy = "customer")
  private List<Loan> loans = new ArrayList<>();

  @ManyToMany
  @JoinTable(name="contract",
    joinColumns = @JoinColumn(name="CUSTOMER_ID"),
    inverseJoinColumns = @JoinColumn(name="TELLER_ID"))
  private List<Teller> tellers;

  @OneToOne
  @JoinColumn(name="ACCOUNT_ID")
  private Account account;

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

  public String getFiscalcode() {
    return fiscalcode;
  }

  public void setFiscalcode(String fiscalcode) {
    this.fiscalcode = fiscalcode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public Integer getAcctNo() {
    return acctNo;
  }

  public void setAcctNo(Integer acctNo) {
    this.acctNo = acctNo;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public List<Loan> getLoans() {
    return loans;
  }

  public void setLoans(List<Loan> loans) {
    this.loans = loans;
  }

  public List<Teller> getTellers() {
    return tellers;
  }

  public void setTellers(List<Teller> tellers) {
    this.tellers = tellers;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
