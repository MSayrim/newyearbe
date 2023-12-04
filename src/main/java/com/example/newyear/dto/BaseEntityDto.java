package com.example.newyear.dto;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.ZonedDateTime;
@Data
public class BaseEntityDto implements Serializable {
    private Long id;
    private ZonedDateTime creationDate;
    private ZonedDateTime modificationDate;
}
