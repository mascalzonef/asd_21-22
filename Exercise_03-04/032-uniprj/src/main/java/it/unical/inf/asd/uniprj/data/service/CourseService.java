package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dto.StudentValue;
import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CourseService {

  Course getById(Long id);

  Course save(Course course);

  Optional<Course> getByTitle(String title);

  String getTitleById(long id);

  Collection<Course> getAll(Specification<Course> spec);

  Collection<Course> getAll();

}
