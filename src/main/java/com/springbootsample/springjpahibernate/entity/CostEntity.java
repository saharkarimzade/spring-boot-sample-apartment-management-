package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import static com.springbootsample.springjpahibernate.entity.CostEntity.TABLE_NAME;

@Entity
@Data
@Table(name = TABLE_NAME)
public class CostEntity {

    public static final String TABLE_NAME = "cost";

    @Id
    @GeneratedValue
    private int id;
    @OneToMany(mappedBy = "id",targetEntity = CostCategoryEntity.class)
    private long costCategoryId;
    private BigDecimal amount;
    private LocalDate deadline;
    private String BillImageHash;

}
