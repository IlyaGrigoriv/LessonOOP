package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.Exceptions;
import org.example.Repeat.Lesson6.Model.Gender;
import org.example.Repeat.Lesson6.Model.Menu;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Input {
    private Scanner _scanner = new Scanner(System.in);
    private Menu _menu = new Menu();
    private Exceptions _exceptions =new Exceptions();
    public String inputString(){
        String str = _scanner.next();
        return str;
    }

    private Calendar inputData(){
        return new GregorianCalendar(inputData(7), inputData(8), inputData(9));
    }

    public String newName(int index) {
        boolean isRun = true;
        String name;

        do {
            _menu.getMenu(index);
            name = inputString();
//            inputString();
            if (!_exceptions.stringCheck(name))
                isRun = false;
        } while (isRun);
        return name;
    }

    public Calendar newData(int index) {
        boolean isRun = true;
        Calendar data;

        do {
            _menu.getMenu(index);
            data = inputData();
                isRun = false;
        } while (isRun);
        return data;
    }

    public Gender Gender(int index) {
        boolean isRun = true;
        String gender;
        Gender gender1 = null;

        do {
            _menu.getMenu(index);
            gender = inputString();

            if (_exceptions.genderInputCheck(gender)) {
                isRun = false;
                gender1 = setGender(gender);
            }else ;

        } while (isRun);
        return gender1;
    }

    private Gender setGender(String str){
        str = str.toLowerCase();
        Gender gender = null;

        if(str.equals("м")){
            gender = Gender.m;
        }else gender = Gender.f;
        return gender;
    }

    private int inputData(int index){
        int data;
        _menu.getMenu(index);
        return _scanner.nextInt();
    }
}
