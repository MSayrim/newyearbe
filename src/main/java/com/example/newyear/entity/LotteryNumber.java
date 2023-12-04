package com.example.newyear.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class LotteryNumber extends BaseEntity {
    private int number;
    private Personal personal;
}
