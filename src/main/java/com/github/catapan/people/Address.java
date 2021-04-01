package com.github.catapan.people;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Address extends PanacheEntity {

  public Integer number;
}
