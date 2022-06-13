package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Competencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long>{
    
    List<Competencia> findByPersona_Id(Long persona_id);
    
}
