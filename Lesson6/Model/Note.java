package org.example.Repeat.Lesson6.Model;
import java.util.Calendar;
import java.util.Date;

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

    public Note(String name, String surName, String lastName, long phoneNumber,  Gender gender) {
        _name = name;
        _surName = surName;
        _lastName = lastName;
        _phoneNumber = phoneNumber;
        _gender = gender;
        _data = null;
    }

    public String getName() {
        return _name;
    }

    public String getSurName() {
        return _surName;
    }

    public String getLastName() {
        return _lastName;
    }

    public long getPhoneNumber() {
        return _phoneNumber;
    }

    public Gender getGender() {
        return _gender;
    }

    public Calendar getData() {
        return _data;
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
