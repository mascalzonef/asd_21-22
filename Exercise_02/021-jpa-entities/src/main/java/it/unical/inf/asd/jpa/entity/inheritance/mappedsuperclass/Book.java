package it.unical.inf.asd.jpa.entity.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "MS_Book")
public class Book extends Publication {
 
    @Column
    private int pages;
}