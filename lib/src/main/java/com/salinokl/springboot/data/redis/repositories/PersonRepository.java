package com.salinokl.springboot.data.redis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.salinokl.springboot.data.redis.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

}
