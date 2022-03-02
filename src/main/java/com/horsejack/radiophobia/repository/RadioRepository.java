package com.horsejack.radiophobia.repository;

import com.horsejack.radiophobia.model.Radio;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "radios", path="radios")
public interface RadioRepository extends PagingAndSortingRepository<Radio, Long> {

    List<Radio> findByName(@Param("name") String name);

}
