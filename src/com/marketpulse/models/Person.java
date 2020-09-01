package com.marketpulse.models;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    List<Person> childrens=new ArrayList<>();
    Gender gender;
    Person father;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public Person(String firstName, String lastName, Gender gender, Person father) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.father=father;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Person> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Person> childrens) {
        this.childrens = childrens;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }
}
