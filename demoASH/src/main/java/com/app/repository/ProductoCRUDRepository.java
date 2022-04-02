package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Producto;

public interface ProductoCRUDRepository extends CrudRepository<Producto,Long>{

}
