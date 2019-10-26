package com.mylocal.parsers.entity;

import java.util.List;
import java.util.stream.Collectors;

public class EntityClass {

    private String name;
    private List<EntityField> fields;

    public EntityClass(String name, List<EntityField> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EntityField> getFields() {
        return fields;
    }

    public void setFields(List<EntityField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "EntityClass{" +
                "name='" + name + '\'' +
                ",\nfields=\n" + fields.stream().map(EntityField::toString).collect(Collectors.joining("\n")) +
                '}';
    }
}
