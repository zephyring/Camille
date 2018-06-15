package com.zeflora.camille.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:47 PM
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    @OneToOne
    private Address address;

}
