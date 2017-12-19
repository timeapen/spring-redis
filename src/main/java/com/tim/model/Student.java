package com.tim.model;

import java.io.Serializable;

public class Student implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    public String id;
    public String lastName;
    public String firstName;
    public Gender gender;
    public int grade;

    public Student(String id, String lastName, String firstName, Gender gender, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
