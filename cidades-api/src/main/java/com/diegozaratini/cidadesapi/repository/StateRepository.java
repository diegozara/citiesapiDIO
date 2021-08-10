package com.diegozaratini.cidadesapi.repository;

import com.diegozaratini.cidadesapi.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
