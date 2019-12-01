package com.ramon.gabarito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramon.gabarito.domain.Tamanho;

@Repository
public interface TamanhoRepository extends JpaRepository<Tamanho, Integer> {

}
