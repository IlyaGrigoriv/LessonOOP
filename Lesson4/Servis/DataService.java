package org.example.Repeat.Lesson4.Servis;

import org.example.Repeat.Lesson4.Model.*;

import java.util.ArrayList;

public class DataService {
    private ArrayList<Teacher> _teachers = new ArrayList<>();

    private ArrayList<Student> _students = new ArrayList<>();//добавил отдельно список студентов и учителей


    public void createNewUser(String name, String surName, TypeUser typeUser) {
        if (typeUser == TypeUser.Student) {
            Student user = new Student(name, surName);
            _students.add(user);
        } else if (typeUser == TypeUser.Teacher) {
            Teacher user = new Teacher(name, surName);
            _teachers.add(user);
        }
    }

    public int getAmountTeachers(){
        return _teachers.size();
    }

    public int getAmountStudents(){
        return _students.size();
    }

    public ArrayList<Teacher> getAllTeachers() {
        return _teachers;
    }
    public ArrayList<Student> getAllStudents(){
        return _students;
    }
}
