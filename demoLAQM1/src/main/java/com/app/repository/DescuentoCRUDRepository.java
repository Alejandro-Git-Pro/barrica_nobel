package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.app.entity.Descuento;

@Repository
@RepositoryRestResource (collectionResourceRel = "descuento", path = "descuentos")
public interface DescuentoCRUDRepository extends CrudRepository<Descuento, Long> {

}
