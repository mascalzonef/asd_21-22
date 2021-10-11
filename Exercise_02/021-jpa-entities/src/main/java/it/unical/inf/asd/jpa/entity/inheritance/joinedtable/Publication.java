package it.unical.inf.asd.jpa.entity.inheritance.joinedtable;

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

@Entity(name="JT_Publication")
@Inheritance(strategy = InheritanceType.JOINED)
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