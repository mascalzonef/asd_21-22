package it.unical.inf.asd.bank.data.dao;

import it.unical.inf.asd.bank.data.entities.Bank;
import it.unical.inf.asd.bank.data.entities.Customer;
import it.unical.inf.asd.bank.data.entities.Teller;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {

  @Query("select c.tellers from CUSTOMER c where c.fiscalcode=: cf")
  List<Teller> getContract(String cf);

  default Specification<Customer> theLastFilter(Integer age) {
    return (Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) -> {
      LocalDate date = LocalDate.now().minus(age, ChronoUnit.YEARS);
      Predicate pred = criteriaBuilder.greaterThanOrEqualTo(root.get("birthDate"), date);

      return criteriaQuery.where(pred).distinct(true).getRestriction();
    };
  }
}
