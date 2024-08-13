package org.example;

import java.util.List;

public class Teacher {
    private String name;
    private int age;
    private List<String> title;

    public Teacher (String name, int age, List<String> title) {
        this.name = name;
        this.age = age;
        this.title = title;
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
    public List<String> getTitle() {
        return title;
    }
    public void setTitle(List<String> title) {
        this.title = title;
    }

}
