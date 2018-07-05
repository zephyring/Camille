package com.zeflora.camille.repo;

import com.zeflora.camille.model.Camille;
import com.zeflora.camille.model.CamilleHasAttributesProjection;
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
@RepositoryRestResource(path = "camille", excerptProjection = CamilleHasAttributesProjection.class)
public interface CamilleRepo extends PagingAndSortingRepository<Camille, Long> {

    @RestResource(path = "names")
    List<Camille> findByName(@Param("name") String name);
}
