package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
    
}