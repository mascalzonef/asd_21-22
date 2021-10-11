package it.unical.inf.asd.jpa.entity.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name="STUDENT"/*, schema="SCHOOL" */)
public class Student {

  /*
  IDENTITY Generation: values generated by an identity column in the database, meaning they are auto-incremented.
  SEQUENCE Generation: This generator uses sequences if they're supported by our database, and switches to table generation if they aren't.
                       To customize the sequence name, we can use the @GenericGenerator annotation with SequenceStyleGenerator strategy
  AUTO Generation:     JPA provider will use any strategy it wants to generate the identifiers.
   */

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
  private String name;

  private Integer code;

  @Transient
  // make a field non-persistent
  private Integer age;


  @Temporal(TemporalType.DATE)
  //with JPA 2.2, we also have support for java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime,
  // java.time.OffsetTime and java.time.OffsetDateTime.
  private Date birthDate;


  // other fields, getters and setters

}
