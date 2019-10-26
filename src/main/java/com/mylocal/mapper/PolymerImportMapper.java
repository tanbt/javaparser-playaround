package com.mylocal.mapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Search for `import` URL of a component
 */
public class PolymerImportMapper {
    public static Map<String, String> componentToImport = new HashMap<String, String>() {{
        put("vaadin-text-field", "@vaadin/vaadin-text-field/vaadin-text-field.js");
        put("vaadin-number-field", "@vaadin/vaadin-text-field/src/vaadin-number-field.js");
        put("vaadin-date-picker", "@vaadin/vaadin-date-picker/src/vaadin-date-picker.js");
        put("vaadin-list-box", "@vaadin/vaadin-list-box/src/vaadin-list-box.js");
    }};

    /**
     * todo: Smarter search is important.
     */
    public static String getImport(String componentName) {
        return componentToImport.get(componentName);
    }
}
