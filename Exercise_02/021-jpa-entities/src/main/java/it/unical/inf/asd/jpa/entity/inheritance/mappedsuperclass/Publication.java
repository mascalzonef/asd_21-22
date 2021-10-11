package it.unical.inf.asd.jpa.entity.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class Publication {
 
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