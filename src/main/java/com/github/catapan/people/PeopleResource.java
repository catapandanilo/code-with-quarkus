package com.github.catapan.people;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;

public interface PeopleResource extends PanacheEntityResource<People, Long> {
  
  @MethodProperties(exposed = false)
  People update(Long id, People entity);

}
