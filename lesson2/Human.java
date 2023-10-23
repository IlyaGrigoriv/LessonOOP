package org.example.Repeat.lesson2;

public class Human extends Actor{

    public Human(String name){
        super(name);
    }
    @Override
    public void setMakeOrder(Boolean makeOrder) {
        _isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(Boolean takeOrder) {
        _isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeQueue() {
        return _isMakeOrder;
    }

    @Override
    public boolean isTakeQueue() {
        return _isTakeOrder;
    }
}
