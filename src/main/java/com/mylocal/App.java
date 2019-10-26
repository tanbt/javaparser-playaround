package com.mylocal;

import com.mylocal.parsers.EntityField;
import com.mylocal.parsers.JavaParser;
import com.mylocal.parsers.Polymer3Parser;
import org.jsoup.nodes.Document;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<EntityField> entityFields = JavaParser.read("src/main/resources", "User.java");
        entityFields.forEach(f -> System.out.println(f));

        Document doc = Polymer3Parser.generateDocument(entityFields);
        System.out.println(doc);
    }
}
