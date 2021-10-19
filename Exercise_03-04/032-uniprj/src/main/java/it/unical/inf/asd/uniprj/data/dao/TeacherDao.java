package it.unical.inf.asd.uniprj.data.dao;

import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.Student;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Root;
import java.util.ArrayList;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long>, JpaSpecificationExecutor<Teacher> {

  

}
