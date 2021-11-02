package it.unical.inf.asd.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name="ACCOUNT_PREMIUM")
public class AccountPremium extends Account {

  public enum Promotion {
    PROMO_1, PROMO_2, PROMO_3;
  }

  @Column(name = "POINTS")
  private Integer points;

  @Column(name = "PROMOTION")
  @Enumerated(EnumType.STRING)
  private Promotion promotion;

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }
}
