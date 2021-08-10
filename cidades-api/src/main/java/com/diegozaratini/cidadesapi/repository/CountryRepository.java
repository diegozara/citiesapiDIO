package com.diegozaratini.cidadesapi.repository;

import com.diegozaratini.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
