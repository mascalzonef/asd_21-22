package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface TeacherService {
  List<Teacher> getAllTeacher();

  void deleteTeacherAndEmptyCourse();

  void add(Teacher teacher);

  Teacher save(Teacher teacher);

  Teacher getById(Long valueOf);

  List<Teacher> getAllTeacherByLastFilter(String... names);

  List<Teacher> getAllTeacher(Specification<Teacher> aaa);
}
