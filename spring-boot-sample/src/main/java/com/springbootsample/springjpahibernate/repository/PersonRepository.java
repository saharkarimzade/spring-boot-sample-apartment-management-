package com.springbootsample.springjpahibernate.repository;

import com.springbootsample.springjpahibernate.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
