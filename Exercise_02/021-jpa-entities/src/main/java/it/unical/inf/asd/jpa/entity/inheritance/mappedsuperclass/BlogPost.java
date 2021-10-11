package it.unical.inf.asd.jpa.entity.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "MS_BlogPost")
public class BlogPost extends Publication {
 
    @Column
    private String url;
 
}