package com.kovinz.pizzasbackend.controller;

import com.kovinz.pizzasbackend.model.Pizza;
import com.kovinz.pizzasbackend.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/pizzas", produces = "application/json")
@CrossOrigin(origins="*")
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaService service;

    @GetMapping
    public Iterable<Pizza> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pizza> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Pizza postPizza(@RequestBody Pizza pizza) {
        return service.save(pizza);
    }

}
