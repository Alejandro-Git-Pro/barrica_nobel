package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.app.entity.Unidad;

@Repository
@RepositoryRestResource (collectionResourceRel = "unidad", path = "unidades")
public interface UnidadCRUDRepository extends CrudRepository<Unidad, Long > {

}
