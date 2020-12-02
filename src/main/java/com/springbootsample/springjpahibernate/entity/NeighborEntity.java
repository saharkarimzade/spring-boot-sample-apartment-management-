package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.springbootsample.springjpahibernate.entity.NeighborEntity.TABLE_NAME;

@Entity
@Data
@Table(name = TABLE_NAME)
public class NeighborEntity {

    public static final String TABLE_NAME = "neighbor";

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;

}
