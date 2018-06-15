package com.zeflora.camille.repo;

import com.zeflora.camille.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:49 PM
 */
@RepositoryRestResource
public interface PersonRepo extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);
}
