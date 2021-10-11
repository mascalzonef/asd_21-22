package it.unical.inf.asd.jpa.entity.many2many.compositekey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
class Student {

    @Id
    Long id;

    // ...
 
    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;
 
    // ...
}