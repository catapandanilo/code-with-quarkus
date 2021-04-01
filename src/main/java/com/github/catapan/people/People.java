package com.github.catapan.people;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class People extends PanacheEntity {
  
  public String name;

  public Integer age;

  @OneToOne(cascade = CascadeType.ALL)
  public Address address;
}