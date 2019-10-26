package com.mylocal;

import com.mylocal.parsers.EntityField;
import com.mylocal.parsers.JavaParser;
import com.mylocal.parsers.Polymer3Parser;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<EntityField> entityFields = JavaParser.read("src/main/resources", "User.java");
        entityFields.forEach(f -> System.out.println(f));

        String html = Polymer3Parser.generateDocument(entityFields);
        System.out.println(html);
    }
}
