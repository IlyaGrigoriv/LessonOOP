package org.example.Repeat.Lesson1;

public abstract class Product {
    private String _name;
    private int _price;
    private double _volume;
    private int _amount;
    private int _id;
    private static Integer _count;

    public Product(){
        _count++;
        _amount = 10;
        _id = _count;
    }

    public Product(String name, int price, double volume) {
        _name = name;
        _price = price;
        _volume = volume;
        _amount = 10;//рандомное кол-во для пробы
        _count++;
        _id = _count;
    }

    static {
        _count = 0;
    }

    public String getName() {
        return _name;
    }

    public void setPrice(int price){
        _price = price;
    }

    public void setVolume(double volume){
        _volume = volume;
    }

    public void setName(String name){
        _name = name;
    }

    public void setAmount(int amount){
        _amount = amount;
    }

    public void reduceAmount(int amount){
        _amount -= amount;
    }

    public void show() {
        System.out.print(" id "+_id+" Название "+ _name+ " объем "+ _volume+ " Цена "+_price+" руб "+ " "+_amount+" шт ");
    }

    public boolean checkAmount(int amount){
        if (_amount >= amount){
            return true;
        }else return false;
    }
}
