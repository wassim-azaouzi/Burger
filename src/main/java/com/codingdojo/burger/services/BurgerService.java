package com.codingdojo.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.burger.models.Burger;
import com.codingdojo.burger.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	// adding the book repository as a dependency
    private final BurgerRepository burgerRepository;
    
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    
    
    // returns all the books
    public List<Burger> allBurgers() {
        return (List<Burger>) burgerRepository.findAll();
    }
    
    
    // creates a book
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    
    
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
    
    
    //update a book 
    public Burger updateBurger(Burger b) {
        return burgerRepository.save(b);
    }
    
    
    
    // delete a book
    public void deleteBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
        	burgerRepository.deleteById(id);
        } 
    }
}
