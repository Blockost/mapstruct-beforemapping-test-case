package com.blockost.mapstructbeforemappingtestcase;

import java.util.Set;

public class ParentClassEntity {

    private Set<ChildClassEntity> childClassEntities;

    public Set<ChildClassEntity> getChildClassEntities() {
        return childClassEntities;
    }

    public void setChildClassEntities(
            Set<ChildClassEntity> childClassEntities) {
        this.childClassEntities = childClassEntities;
    }
}
