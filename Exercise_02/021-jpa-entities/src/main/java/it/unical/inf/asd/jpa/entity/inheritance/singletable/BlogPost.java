package it.unical.inf.asd.jpa.entity.inheritance.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "ST_BlogPost")
@DiscriminatorValue("Blog")
public class BlogPost extends Publication {
 
    @Column
    private String url;
 
}