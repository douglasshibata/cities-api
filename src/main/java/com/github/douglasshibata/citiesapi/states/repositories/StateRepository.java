package com.github.douglasshibata.citiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.douglasshibata.citiesapi.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}