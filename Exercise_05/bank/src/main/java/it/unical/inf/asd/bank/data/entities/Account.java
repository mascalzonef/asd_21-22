package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNT", uniqueConstraints =
  @UniqueConstraint(columnNames = {"REGION_CODE", "RSS_NO"} ))
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Long id;

  @Basic(optional = false)
  @Column(name = "DATE")
  private LocalDateTime creationDate;

  @Basic(optional = false)
  @Column(name = "REGION_CODE")
  private Integer regionCode;

  @Basic(optional = false)
  @Column(name = "RSS_NO")
  private String rssNo;

  @Embedded
  private Credential credential;

  @OneToOne
  private Customer customer;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(Integer regionCode) {
    this.regionCode = regionCode;
  }

  public String getRssNo() {
    return rssNo;
  }

  public void setRssNo(String rssNo) {
    this.rssNo = rssNo;
  }

  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
