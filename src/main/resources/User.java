package com.mylocal;

import java.util.Date;
import java.util.List;

public class User {

    private String name;
    private int age;
    private List<String> messages;
    private Date birthday;

    public User() {
    }

    public User(String name, int age, List<String> messages, Date birthday) {
        this.name = name;
        this.age = age;
        this.messages = messages;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
