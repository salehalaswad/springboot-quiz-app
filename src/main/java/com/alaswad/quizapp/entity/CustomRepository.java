package com.alaswad.quizapp.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepository extends CrudRepository<Question,Integer> {
}
