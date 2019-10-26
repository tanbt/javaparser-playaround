package com.mylocal.parsers.entity;

public class EntityField {
    String modifier;
    String varName;
    String varType;

    public EntityField() {
    }

    public EntityField(String modifier, String varName, String varType) {
        this.modifier = modifier;
        this.varName = varName;
        this.varType = varType;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    @Override
    public String toString() {
        return "EntityField{" +
                "modifier='" + modifier + '\'' +
                ", varName='" + varName + '\'' +
                ", varType='" + varType + '\'' +
                '}';
    }
}