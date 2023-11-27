package org.example.Repeat.Lesson4.Model;

public class Student extends User implements Create {
    private int _studentId;
    private static int _count = 0;

    public Student(String name, String surName) {
        super(name, surName);
        _count++;
        _studentId = _count;
    }

    @Override
    public String toString() {
        return "Student{" +
                " Id " + _studentId +
                super.toString() +
                '}';
    }

    public int getId() {
        return _studentId;
    }

    @Override
    public void create(String name, String surname) {
        new Student(name, surname);
    }
}
