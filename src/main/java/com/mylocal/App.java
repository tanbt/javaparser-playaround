package com.mylocal;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User u1 = new User("Tan", 300,
                Arrays.asList(new String[] { "hi jackson", "U know me" }));
        System.out.println(JavaObjectToJsonConverter.valuesToJson(u1));
        System.out.println(JavaObjectToJsonConverter.valuesToPrettyJson(u1));
    }
}
