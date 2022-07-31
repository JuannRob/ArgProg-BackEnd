package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long>{
    
}
