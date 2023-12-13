package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.Gender;
import org.example.Repeat.Lesson6.Model.Menu;
import org.example.Repeat.Lesson6.Model.Note;

import java.util.Date;

public class Service {
    private Note _note;
    private Menu _menu = new Menu();
    private Input _input =new Input();
    private View view = new View();

    public void createNewEntry(){
        _menu.menuName();
        String name = _input.inputString();
        _menu.menuSurName();
        String surName = _input.inputString();
        _menu.menuLastName();
        String lastName = _input.inputString();
        _menu.menuData();
        String data = _input.inputString() ;
        _menu.menuPhoneNumber();
        String phoneNumber = _input.inputString();
        _menu.menuGender();
        Gender gender = _input.inputGender();
        _note = new Note(name,surName,lastName,phoneNumber,data, gender);
    }

    public void checkValidate(){

    }
}
