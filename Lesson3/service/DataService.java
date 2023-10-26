package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.Student;
import org.example.Repeat.Lesson3.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService<T extends User> {

    private ArrayList<T> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<T> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic,int year,int moth,int day){
        T student = (T) new User(firstName,secondName,patronymic,year,moth,day);
        this.users.add(student);
    }

}
