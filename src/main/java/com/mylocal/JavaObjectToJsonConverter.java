package com.mylocal;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaObjectToJsonConverter {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String valuesToJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "empty";
    }

    public static String valuesToPrettyJson(Object obj) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "empty";
    }


}
