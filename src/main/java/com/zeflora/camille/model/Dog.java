package com.zeflora.camille.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 10:03 AM
 */
@Entity
@Data
public class Dog implements Pet {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int age;
}
