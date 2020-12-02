package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.springbootsample.springjpahibernate.entity.CostCategoryEntity.TABLE_NAME;

@Entity
@Data
@Table(name = TABLE_NAME)
public class CostCategoryEntity {

    public static final String TABLE_NAME = "cost_category";

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private CostCategoryTypeEnum costCategoryType;
    private String description;
}
