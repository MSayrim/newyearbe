package com.example.newyear.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Personal extends BaseEntity{
    private String name;
    private String surname;
}

