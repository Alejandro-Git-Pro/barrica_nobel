package com.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.entity.Descuento;

@RepositoryRestResource(collectionResourceRel = "descuento", path = "descuentos")
public interface DescuentoQUERYRepository extends PagingAndSortingRepository<Descuento, Long> {

	List<Descuento> findById(@Param("id") String id);
}
