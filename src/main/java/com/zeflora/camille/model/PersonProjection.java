package com.zeflora.camille.model;

import org.springframework.data.rest.core.config.Projection;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 10:19 AM
 */
@Projection(types = {Person.class})
interface PersonProjection {
    String getFirstName();
    String getLastName();
}
