package org.example.Repeat.Lesson6.Model;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> _menu;
    public Menu(){
        _menu = new ArrayList<>();
        _menu.add("В видите имя");
        _menu.add("В видите фамилию");
        _menu.add("В видите отчество");
        _menu.add("В видите телефонный номер");
        _menu.add("В видите дату рождения");
        _menu.add("В видите пол м или ж");
        _menu.add("Для выхода нажмите 0");
        _menu.add("день");//7
        _menu.add("месяц");//8
        _menu.add("год");//9

    }

    public int getSize(){
        return _menu.size();
    }

    public void getMenu(int index){
        System.out.println(_menu.get(index));
    }

    private void menuName(){
        System.out.println("В видите имя");
    }

    private void menuSurName(){
        System.out.println("В видите фамилию");
    }

    private void menuLastName(){
        System.out.println("В видите отчество");
    }

    private void menuPhoneNumber(){
        System.out.println("В видите телефонный номер");
    }

    private void menuData(){
        System.out.println("В видите дату рождения");
    }

    private void menuGender(){
        System.out.println("В видите пол");
    }
}
