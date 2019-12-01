package com.ramon.gabarito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramon.gabarito.domain.Adicional;

@Repository
public interface AdicionalRepository extends JpaRepository<Adicional, Integer>{

}
