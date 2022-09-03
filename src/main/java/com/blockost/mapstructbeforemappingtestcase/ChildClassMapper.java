package com.blockost.mapstructbeforemappingtestcase;

import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface ChildClassMapper {

    ChildClassDTO toDTOWithoutQualifier(ChildClassEntity entity);

    @Named("qualifier")
    ChildClassDTO toDTOWithQualifier(ChildClassEntity entity);

    @BeforeMapping
    default Set<ChildClassDTO> beforeMapping(java.util.Collection<ChildClassEntity> collection) {
        return Set.of();
    }

}
