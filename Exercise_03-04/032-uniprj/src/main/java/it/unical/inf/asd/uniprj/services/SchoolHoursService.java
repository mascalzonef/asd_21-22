package it.unical.inf.asd.uniprj.services;

import it.unical.inf.asd.uniprj.data.dao.CourseDao;
import it.unical.inf.asd.uniprj.data.dao.StudentDao;
import it.unical.inf.asd.uniprj.data.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolHoursService {

  @Autowired
  private StudentDao studentDao;

  @Autowired
  private CourseDao courseDao;

  public String make() {
    //...
    return null;
  }
}
