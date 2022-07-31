package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Formacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository<Formacion, Long> {
    
    List<Formacion> findByPersona_Id(Long persona_id);
}
