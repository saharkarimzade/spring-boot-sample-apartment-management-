package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.springbootsample.springjpahibernate.entity.UnitEntity.TABLE_NAME;

@Entity
@Data
@Table(name = TABLE_NAME)
public class UnitEntity {
    public static final String TABLE_NAME = "unit";

    @Id
    @GeneratedValue
    private Long id;
    private String no;
    private String title;
    private RoleEnum role;
    private String phoneNumber;
    private String address;

}
