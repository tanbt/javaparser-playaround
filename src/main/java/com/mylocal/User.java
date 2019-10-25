package com.mylocal;

import java.util.List;

public class User {

    private String name;
    private int age;
    private List<String> messages;

    public User() {
    }

    public User(String name, int age, List<String> messages) {
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
