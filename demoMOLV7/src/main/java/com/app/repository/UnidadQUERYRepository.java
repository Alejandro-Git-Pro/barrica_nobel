package com.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.app.entity.Unidades;
@Repository
@RepositoryRestResource(collectionResourceRel = "unidad", path = "unidad")
public interface UnidadQUERYRepository {
	List<Unidades> findByNombrePack(@Param("nombrePack") String nombrePack);
}
