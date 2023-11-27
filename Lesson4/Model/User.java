package org.example.Repeat.Lesson4.Model;

public  abstract class User implements Create{
    private String _name;
    private String _surName;

    public User(String name, String surName) {
        _name = name;
        _surName = surName;
    }

    @Override
    public String toString() {
        return " " +
                " имя " + _name + '\'' +
                " фамилия " + _surName + '\'' +
                " ";
    }
}
