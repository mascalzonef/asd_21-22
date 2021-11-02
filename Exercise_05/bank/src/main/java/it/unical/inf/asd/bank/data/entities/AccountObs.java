package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="ACCOUNT_OBS")
public class AccountObs extends Account {

  @Column(name = "AREA", length = 2)
  private String area;

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }
}
