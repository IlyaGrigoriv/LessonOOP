package org.example.Repeat.Lesson1;

public class BottleOfWater extends Product {
    private static Status _typeDrink = Status.Холодный;

    public BottleOfWater(String name, int price,double volume) {
        super(name, price , volume);
    }

    public BottleOfWater(){
        super();
    }

    @Override
    public void show(){
        super.show();
        System.out.println(_typeDrink);
    }
}
