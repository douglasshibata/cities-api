package com.github.douglasshibata.citiesapi.countries.resources;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.douglasshibata.citiesapi.countries.entities.Country;
import com.github.douglasshibata.citiesapi.countries.repositories.CountryRepository;

@RestController
public class CountryResources {

	private final CountryRepository repository;

	public CountryResources(final CountryRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/countries")
	public List<Country> cities() {

		return repository.findAll();
	}
}
