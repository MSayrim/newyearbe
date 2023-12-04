package com.example.newyear.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    private Long id;
    @CreatedDate
    private ZonedDateTime creationDate;
    @LastModifiedDate
    private ZonedDateTime modificationDate;
}
