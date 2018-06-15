package com.zeflora.camille.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 12:06 AM
 */
@Entity
@Data
public class Address {
    @Id @GeneratedValue
    private long id;
    private String street;
    private String city;
}
