package it.unical.inf.asd.jpa.entity.inheritance.joinedtable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "JT_BlogPost")
public class BlogPost extends Publication {
 
    @Column
    private String url;

}
