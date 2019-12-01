package com.ramon.gabarito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramon.gabarito.domain.Sabor;

@Repository
public interface SaborRepository extends JpaRepository<Sabor, Integer>{

}
