package org.example.Repeat.Lesson1;

public  class Menu {
    public  void selectUserStatus() {
        System.out.println("Нажми 1 если хочешь купить напиток ");
        System.out.println("Нажми 2 если хочешь положить напиток ");
        System.out.println("Для выхода нажмите 0 ");
    }

    public  void chooseFromTheList() {
        System.out.println("Введите номер id ");
    }

    public void createDrinkType(){
        System.out.println("Нажмите 1 создать холодный напиток");
        System.out.println("Нажмите 2 создать горячий напиток");
    }

    public  void addName(){
        System.out.println("Напишите название");
    }

    public  void addPrice(){
        System.out.println("Напишите цену ");
    }

    public  void addVolume(){
        System.out.println("Какой объем");
    }

    public void addAmount(){
        System.out.println("Какое кол-во");
    }

    public  void menuAddAmount(){
        System.out.println("Введите кол-во");
    }

    public void showError(){
        System.out.println("Неправильный ввод");
    }
}
