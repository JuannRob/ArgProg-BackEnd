package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Extra;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraRepository extends JpaRepository<Extra, Long>{
    
    List<Extra> findByPersona_Id(Long persona_id);
    
}
