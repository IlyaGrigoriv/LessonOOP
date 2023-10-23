package org.example.Repeat.Lesson1;

public class HotDrink extends Product implements GetProduct{
    private static Status _typeDrink = Status.горячий;
    private  int _amount;//наверно не нужен

    public HotDrink(String name, int price, double volume) {
        super(name, price,volume);
        _amount = 1;
    }

    public HotDrink(){
        super();
    }

    @Override
    public void show(){
        super.show();
        System.out.println(_typeDrink);
    }

    @Override
    public HotDrink getProduct() {
        return new HotDrink();
    }
}
