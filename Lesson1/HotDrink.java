package org.example.Repeat.Lesson1;

public class HotDrink extends Product {
    private static Status _typeDrink = Status.горячий;


    public HotDrink(String name, int price, double volume) {
//        amount = 1;
        super(name, price,volume);
    }

    public HotDrink(){
        super();
    }

    @Override
    public void show(){
        super.show();
        System.out.println(_typeDrink);
    }
}
