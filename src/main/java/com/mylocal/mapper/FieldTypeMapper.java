package com.mylocal.mapper;

import java.util.HashMap;
import java.util.Map;

public class FieldTypeMapper {
    public static Map<String, String> javaTypeToComponent = new HashMap<String, String>() {{
        put("String", "vaadin-text-field");
        put("int", "vaadin-number-field");
        put("Date", "vaadin-date-picker");
        put("List", "vaadin-list-box");
    }};

    /**
     * Smarter mapper is important.
     */
    public static String getComponent(String fieldType) {
        return javaTypeToComponent.get(fieldType);
    }
}
