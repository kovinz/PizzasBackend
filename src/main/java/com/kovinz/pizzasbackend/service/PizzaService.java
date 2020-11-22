package com.kovinz.pizzasbackend.service;

import com.kovinz.pizzasbackend.model.Pizza;
import com.kovinz.pizzasbackend.repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository repository;

    public Optional<Pizza> findById(Long id) {
        return repository.findById(id);
    }

    public Iterable<Pizza> findAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Pizza save(Pizza pizza) {
        return repository.save(pizza);
    }

}
