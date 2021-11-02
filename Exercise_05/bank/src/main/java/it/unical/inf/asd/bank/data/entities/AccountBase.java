package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="ACCOUNT_BASE")
public class AccountBase extends Account {

  @Column(name = "POINTS")
  private Integer points;

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }
}
