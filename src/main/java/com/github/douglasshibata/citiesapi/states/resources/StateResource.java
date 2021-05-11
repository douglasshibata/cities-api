package com.github.douglasshibata.citiesapi.states.resources;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.douglasshibata.citiesapi.states.entities.State;
import com.github.douglasshibata.citiesapi.states.repositories.StateRepository;

@RestController
@RequestMapping("/staties")
public class StateResource {

	private final StateRepository repository;

	public StateResource(final StateRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<State> staties() {
		return repository.findAll();
	}
}