package it.unical.inf.asd.jpa.entity.one2many.m2m;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
class Course {

    @Id
    private Long id;

    // ...
 
    @OneToMany(mappedBy = "course")
    Set<CourseRegistration> registrations;

    // ...
}