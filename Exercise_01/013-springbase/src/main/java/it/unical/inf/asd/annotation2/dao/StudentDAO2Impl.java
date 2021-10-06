package it.unical.inf.asd.annotation2.dao;

import it.unical.inf.asd.annotation2.dto.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository("studentDao2")
public class StudentDAO2Impl implements StudentDAO
{
    public StudentDTO createNewStudent()
    {
        StudentDTO e = new StudentDTO();
        e.setId(1);
        e.setFirstName("Lokesh2");
        e.setLastName("Gupta2");
        return e;
    }
}