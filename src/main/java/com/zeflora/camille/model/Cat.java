package com.zeflora.camille.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 10:04 AM
 */
@Data
public class Cat implements Pet {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int age;
}
