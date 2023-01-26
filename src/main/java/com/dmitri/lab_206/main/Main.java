package com.dmitri.lab_206.main;

import com.dmitri.lab_206.classes.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student samantha = new Student("Smantha", 1);
        Student nico = new Student("Niccoló", 1);
        Student xavi = new Student("Xavi", 1);
        Student jesus = new Student("Jesús", 1);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(samantha.getName(), samantha);
        studentMap.put(nico.getName(), nico);
        studentMap.put(xavi.getName(), xavi);
        studentMap.put(jesus.getName(), jesus);

        Map<String, Student> studentIncreased = increaseGrade(studentMap);
        studentIncreased.forEach((key, value)->{
            System.out.println(value.getGrade());
        });
    }
    public static Map<String, Student> increaseGrade(Map<String, Student> studentMap){
        Map<String, Student> studentIncreasedGrade = new HashMap<>();
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            studentIncreasedGrade.put(entry.getKey(), new Student(entry.getKey(), entry.getValue().getGrade() * 10));
        }
        return studentIncreasedGrade;
    }
}
