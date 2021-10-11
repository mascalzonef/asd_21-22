package it.unical.inf.asd.jpa.entity.inheritance.onetableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity(name="TC_Publication")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Publication {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;
 
    @Column
    protected String title;
 
    @Column(name = "version")
    private int version;
 
    @Column
    @Temporal(TemporalType.DATE)
    private Date publishingDate;

}