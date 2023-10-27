package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.User;

import java.util.ArrayList;

public class TeacherService <T extends User> {
    private ArrayList<T> users;

    public TeacherService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<T> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic,int year,int moth,int day){
        T teacher = (T) new User(firstName,secondName,patronymic,year,moth,day);
        this.users.add(teacher);
    }
}
