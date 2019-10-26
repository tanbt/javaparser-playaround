package com.mylocal;

import com.mylocal.parsers.EntityField;
import com.mylocal.parsers.JavaParser;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<EntityField> entityFields = JavaParser.read("src/main/resources", "User.java");
        entityFields.forEach(f -> System.out.println(f));
    }
}
