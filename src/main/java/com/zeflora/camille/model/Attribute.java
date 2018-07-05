package com.zeflora.camille.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/21/18
 * Time: 9:06 PM
 */
@Entity
@Data
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String key;
    @Lob
    private String value;

    @ManyToOne
    @JoinColumn(name = "camilleId")
    private Camille camille;
}
