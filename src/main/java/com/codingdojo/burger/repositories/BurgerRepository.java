package com.codingdojo.burger.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.burger.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {

}
