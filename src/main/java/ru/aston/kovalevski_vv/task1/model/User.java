package ru.aston.kovalevski_vv.task1.model;

public class User {

    private Integer age;
    private String name;
    private String sourName;

    public User(Integer age, String name, String sourName) {
        this.age = age;
        this.name = name;
        this.sourName = sourName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }
}