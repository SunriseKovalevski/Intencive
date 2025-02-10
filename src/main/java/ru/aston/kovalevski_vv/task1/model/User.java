package ru.aston.kovalevski_vv.task1.model;

import java.util.Objects;

public class User {

    private Integer age;
    private String name;
    private String surname;

    public User(Integer age, String name, String sourName) {
        this.age = age;
        this.name = name;
        this.surname = sourName;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Name   : " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age    : " + age + "\n";
    }
}