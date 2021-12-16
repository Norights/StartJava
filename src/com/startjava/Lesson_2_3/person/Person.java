package com.startjava.Lesson_2_3.person;

public class Person {
    
    String gender = "Male";
    String name = "Nick";
    int  height = 180;
    int  weight = 80;
    int  age = 40;

    void walk() {
        System.out.println("He can walk");
    }

    boolean sit() {
        System.out.println("He can sit");
        return true;
    }

    boolean run() {
        System.out.println("He can run");
        return true;
    }

    String talk() {
        return "He can talk";
    }

    String studyJava() {
        return "He can study Java";
    }
}
