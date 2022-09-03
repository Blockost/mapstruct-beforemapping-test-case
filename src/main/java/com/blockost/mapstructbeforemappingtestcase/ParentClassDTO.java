package com.blockost.mapstructbeforemappingtestcase;

import java.util.Set;

public class ParentClassDTO {

    private Set<ChildClassDTO> childClassDTOs;

    public Set<ChildClassDTO> getChildClassDTOs() {
        return childClassDTOs;
    }

    public void setChildClassDTOs(Set<ChildClassDTO> childClassDTOs) {
        this.childClassDTOs = childClassDTOs;
    }
}
