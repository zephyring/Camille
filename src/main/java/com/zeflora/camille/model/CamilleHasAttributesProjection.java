package com.zeflora.camille.model;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 10:19 AM
 */
@Projection(name = "hasAttributes", types = {Camille.class})
public interface CamilleHasAttributesProjection {
    String getName();
    Date getCreatedDate();
    Date getLastModifiedDate();
    List<Attribute> getAttributes();
}
