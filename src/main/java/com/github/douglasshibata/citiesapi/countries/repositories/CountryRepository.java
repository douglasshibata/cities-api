package com.github.douglasshibata.citiesapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.douglasshibata.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
