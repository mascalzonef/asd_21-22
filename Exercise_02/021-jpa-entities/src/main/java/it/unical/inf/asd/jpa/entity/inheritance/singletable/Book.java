package it.unical.inf.asd.jpa.entity.inheritance.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "ST_Book")
@DiscriminatorValue("Book")
public class Book extends Publication {
 
    @Column
    private int pages;
}