package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.springbootsample.springjpahibernate.entity.UnitCostEntity.TABLE_NAME;

@Entity
@Data
@Table(name = TABLE_NAME)
public class UnitCostEntity {
    public static final String TABLE_NAME = "unit_cost";

    @Id
    @GeneratedValue
    private long id;
    private long costId;
    private long unitId;
    private double percent;
    private String description;
}
