package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.*;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
