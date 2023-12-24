package org.example.Repeat.Lesson6.Model;
import java.util.Calendar;

public class Note  {
    private String _name;
    private String _surName;
    private String _lastName;
    private long _phoneNumber;
    private Gender _gender;
    private Calendar _data;

    public Note(String name, String surName, String lastName, long phoneNumber,  Calendar data,Gender gender) {
        _name = name;
        _surName = surName;
        _lastName = lastName;
        _phoneNumber = phoneNumber;
        _gender = gender;
        _data = data;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Имя '" + _name + '\'' +
                ", Фамилия " + _surName + '\'' +
                ", Отчество " + _lastName + '\'' +
                ", тел " + _phoneNumber + '\'' +
                ", пол " + _gender +
                ", дата рождения " + _data +
                '}';
    }
}
