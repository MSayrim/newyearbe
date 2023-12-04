package com.example.newyear.mapper;

import com.example.newyear.dto.BaseEntityDto;
import com.example.newyear.entity.BaseEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Named;

import java.util.List;

public interface BaseMapper<E extends BaseEntity, D extends BaseEntityDto> {
    @Named("toEntity")
    E toEntity(D dto);

    @Named("toDto")
    D toDto(E entity);

    @IterableMapping(
            qualifiedByName = {"toEntity"}
    )
    List<E> toEntityList(List<D> dtoList);

    @IterableMapping(
            qualifiedByName = {"toDto"}
    )
    List<D> toDtoList(List<E> entityList);
}
