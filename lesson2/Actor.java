package org.example.Repeat.lesson2;

public abstract class Actor implements ActorBehavior {
    protected final String _name;
    protected boolean _isTakeOrder;
    protected boolean _isMakeOrder;

    public Actor(String name) {
        _name = name;
    }

    public String getName(){
        return _name;
    }
}
