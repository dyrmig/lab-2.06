package com.dmitri.lab_206.classes;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 100) {
            throw new IllegalArgumentException("Value must be between 1 and 100");
        }
        this.grade = grade;
    }

}
