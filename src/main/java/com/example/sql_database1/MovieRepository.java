package com.example.sql_database1;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Actor, Long> {
}
