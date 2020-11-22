package com.kovinz.pizzasbackend.repository;

import com.kovinz.pizzasbackend.model.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> { }
