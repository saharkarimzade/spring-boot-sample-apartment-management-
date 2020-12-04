package com.springbootsample.springjpahibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import static com.springbootsample.springjpahibernate.entity.CostEntity.TABLE_NAME;


    @Entity
    @Data
    @Table(name = TABLE_NAME)
    public class PaymentEntity {

        public static final String TABLE_NAME = "payment";

        @Id
        @GeneratedValue
        private int id;
        @OneToMany(mappedBy = "id",targetEntity = UnitEntity.class)
        private long UnitId;
        private BigDecimal PayedAmount;
        @OneToMany(mappedBy = "id",targetEntity = CostEntity.class)
        private long costId;
        private String PaymentReceiptImageHash;


    }
