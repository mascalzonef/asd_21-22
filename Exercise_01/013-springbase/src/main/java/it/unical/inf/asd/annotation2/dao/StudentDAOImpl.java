package it.unical.inf.asd.annotation2.dao;

import it.unical.inf.asd.annotation2.dto.StudentDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
//@Primary
public class StudentDAOImpl implements StudentDAO
{
    public StudentDTO createNewStudent()
    {
        StudentDTO e = new StudentDTO();
        e.setId(1);
        e.setFirstName("Lokesh");
        e.setLastName("Gupta");
        return e;
    }
}