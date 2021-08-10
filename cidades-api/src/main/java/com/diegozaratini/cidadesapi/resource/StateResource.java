package com.diegozaratini.cidadesapi.resource;

import com.diegozaratini.cidadesapi.entity.State;
import com.diegozaratini.cidadesapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/states")
public class StateResource {

    @Autowired
    private final StateRepository stateRepository;

    public StateResource(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @GetMapping
    public List<State> states (){
        return stateRepository.findAll();
    }
}
