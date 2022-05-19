package com.company.formvalidationinput.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
    public PersonForm() {
    }

    @NotNull
    @Size(min = 2,max = 30)
    private String name;

    @NotNull
    @Size(min = 2,max = 30)
    private String surname;

    @NotNull
    @Min(18)
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public PersonForm(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
