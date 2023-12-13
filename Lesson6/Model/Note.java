package org.example.Repeat.Lesson6.Model;

import java.util.Date;

public class Note {
    private String _name;
    private String _surName;
    private String _lastName;
    private String _phoneNumber;
    private Gender _gender;
    private String _data;

    public Note(String name, String surName, String lastName, String phoneNumber,  String data,Gender gender) {
        this._name = name;
        this._surName = surName;
        this._lastName = lastName;
        this._phoneNumber = phoneNumber;
        this._gender = gender;
        this._data = data;
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
