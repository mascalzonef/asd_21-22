package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dao.StudentDao;
import it.unical.inf.asd.uniprj.data.dto.StudentValue;
import it.unical.inf.asd.uniprj.data.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentDao studentDao;

  @Override
  public Student save(Student student) {
    return studentDao.save(student);
  }

  @Override
  public Collection<Student> findAll(Specification<Student> spec) {
    return studentDao.findAll(spec);
  }

  @Override
  public int count(Student.Gender gender) {
    return studentDao.countByGender(gender);
  }

  @Override
  public List<Student> get(LocalDate birthdate, String lastNameStart) {
    return studentDao.findAllByBirthDateLessThanEqualAndFirstNameIsNotNullAndLastNameStartingWithAndWantsNewsletterTrueOrderByGenderAsc(birthdate, lastNameStart);
  }

  @Override
  public List<Student> getAllByBirthDate(LocalDate from, LocalDate to) {
    return studentDao.findAllByBirthDateBetweenOrderByLastNameDesc(from, to);
  }

  @Override
  public List<Student> getByLastname(String lastname) {
    return studentDao.ciccio(lastname);
  }

  @Override
  public List<Student> getByLastNameAndFirstName(String lastname,
      String firstname) {
    return studentDao.findAllByLastNameAndFirstName(lastname, firstname);
  }

  @Override
  public List<StudentValue> countByGender() {
    return studentDao.countByGenger();
  }
}
