package com.pragmatic.util;

public class Person {
    private String name;
    private int age;
    private String email;

    // Constructor to initialize the fields
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to display information about the person
    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }

    // Getters and Setters (Optional, for accessing fields)
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
