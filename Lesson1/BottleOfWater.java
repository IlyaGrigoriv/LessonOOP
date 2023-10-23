package org.example.Repeat.Lesson1;

public class BottleOfWater extends Product implements GetProduct{
    private static Status _typeDrink = Status.Холодный;
    private int _amount;

    public BottleOfWater(String name, int price, double volume, int amount) {
        super(name, price, volume);
        _amount = amount;
    }

    public BottleOfWater() {
        super();
    }

    @Override
    public void show() {
        super.show();
        System.out.println(_typeDrink + " " +_amount + " шт ");
    }

    public void setAmount(int amount){
        _amount = amount;
    }

    public boolean checkAmount(int amount) {
        if (_amount >= amount) {
            return true;
        } else return false;
    }

    public void reduceAmount(int amount) {
        _amount -= amount;
    }

    @Override
    public BottleOfWater getProduct() {
        return new BottleOfWater();
    }
}
