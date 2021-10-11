package it.unical.inf.asd.jpa.entity.inheritance.onetableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "TC_Book")
public class Book extends Publication {
 
    @Column
    private int pages;
}