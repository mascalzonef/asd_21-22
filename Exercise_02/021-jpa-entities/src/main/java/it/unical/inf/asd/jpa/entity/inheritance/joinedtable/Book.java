package it.unical.inf.asd.jpa.entity.inheritance.joinedtable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "JT_Book")
public class Book extends Publication {
 
    @Column
    private int pages;
 
}