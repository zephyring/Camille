package com.zeflora.camille.repo;

import com.zeflora.camille.model.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:49 PM
 */
@RepositoryRestResource
public interface AddressRepo extends PagingAndSortingRepository<Address, Long> {

}
