package com.zeflora.camille.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:47 PM
 */
@Entity
@Data
public class Camille {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @CreatedDate
    @JsonIgnore
    private Date createdDate = new Date();
    @LastModifiedDate
    @JsonIgnore
    private Date lastModifiedDate = new Date();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camille")
    private List<Attribute> attributes;

}
