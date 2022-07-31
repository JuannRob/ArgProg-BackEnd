package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Experiencia, Long> {
    
    List<Experiencia> findByPersona_Id(Long persona_id);
    
}
