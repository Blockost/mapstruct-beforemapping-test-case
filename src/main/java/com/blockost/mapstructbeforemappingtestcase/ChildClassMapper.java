package com.blockost.mapstructbeforemappingtestcase;

import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.Qualifier;

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


    // XXX 2022-09-03 Blockost beforeMapping method needs to be qualified the same way as the mapping method
    // to be picked up. This fixes the issue
    @Named("qualifier")
    @BeforeMapping
    default Set<ChildClassDTO> beforeMappingWithQualifier(java.util.Collection<ChildClassEntity> collection) {
        return beforeMapping(collection);
    }

}
