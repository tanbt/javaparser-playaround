package com.mylocal;

import com.mylocal.parsers.JavaParser;
import com.mylocal.parsers.Polymer3Parser;
import com.mylocal.parsers.entity.EntityClass;

public class App {
    public static void main(String[] args) {
        EntityClass eClass = JavaParser.read("src/main/resources", "User.java");

        String compContent = Polymer3Parser.generateComponent(eClass);
        System.out.println(compContent);
    }
}
