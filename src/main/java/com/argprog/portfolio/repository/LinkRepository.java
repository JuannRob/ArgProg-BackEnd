package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Link;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long>{
    
    List<Link> findByPersona_Id(Long persona_id);
    
}
