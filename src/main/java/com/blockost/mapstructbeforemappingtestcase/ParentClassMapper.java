package com.blockost.mapstructbeforemappingtestcase;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { ChildClassMapper.class })
public interface ParentClassMapper {

    @Mapping(source = "childClassEntities", target = "childClassDTOs")
    ParentClassDTO toDTOWithoutChildClassQualifier(ParentClassEntity entity);

    @Mapping(source = "childClassEntities", target = "childClassDTOs", qualifiedByName = "qualifier")
    ParentClassDTO toDTOWithChildClassQualifier(ParentClassEntity entity);

}
