package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="LOAN")
public class Loan {

  @Id
  @GeneratedValue
  @Column(name="ID")
  private Long id;

  @Basic(optional = false)
  @Column(name = "DATE")
  private LocalDate date;

  @Basic(optional = false)
  @Column(name = "VALUE")
  private Double value;

  @ManyToOne
  @JoinColumn(name="CUSTOMER_ID")
  private Customer customer;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
