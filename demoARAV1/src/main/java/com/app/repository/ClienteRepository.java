package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.*;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

	@Query(value = "select * from cliente where id=?", nativeQuery = true)
	public List<Cliente> findByCliente(Integer idCliente);

}
