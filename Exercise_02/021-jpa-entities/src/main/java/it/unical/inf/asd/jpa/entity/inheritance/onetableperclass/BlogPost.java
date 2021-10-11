package it.unical.inf.asd.jpa.entity.inheritance.onetableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "TC_BlogPost")
public class BlogPost extends Publication {
 
    @Column
    private String url;
 
}