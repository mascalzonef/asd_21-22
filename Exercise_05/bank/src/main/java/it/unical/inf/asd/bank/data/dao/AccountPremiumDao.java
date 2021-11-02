package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Account;
import it.unical.inf.asd.bank.data.entities.AccountPremium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountPremiumDao extends JpaRepository<AccountPremium, Long> {

  List<AccountPremium> findAllByPromotionAndRegionCodeAndPointsGreaterThanOrderByCredentialUsername(
      AccountPremium.Promotion promotion,
      Integer regionCode,
      Integer point);
}
