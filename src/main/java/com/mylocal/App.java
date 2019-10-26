package com.mylocal;

import com.mylocal.parsers.JavaParser;
import com.mylocal.parsers.Polymer3Parser;
import com.mylocal.parsers.entity.EntityClass;
import com.mylocal.parsers.entity.EntityField;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityClass entityFields = JavaParser.read("src/main/resources", "User.java");
        System.out.println(entityFields);
//        String html = Polymer3Parser.generateDocument(entityFields);
//        System.out.println(html);
    }
}
