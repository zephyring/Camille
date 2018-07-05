package com.zeflora.camille.repo;

import com.zeflora.camille.model.Attribute;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:49 PM
 */
@RepositoryRestResource(path = "attribute")
public interface AttributeRepo extends PagingAndSortingRepository<Attribute, Long> {

    @RestResource(path = "keys")
    List<Attribute> findByKey(@Param("key") String key);

    @RestResource(path = "values")
    List<Attribute> findByValue(@Param("value") String value);

}
