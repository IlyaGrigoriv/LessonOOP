package org.example.Repeat.Lesson7;

import java.util.ArrayList;

public class ToyWarehouse {
    private ArrayList<Toy> _toyArrayList;

    public ToyWarehouse() {
        _toyArrayList = new ArrayList<>();
    }

    public void add(Toy toy){
        _toyArrayList.add(toy);
    }

    public Toy getToy(int index){
        return _toyArrayList.get(index);
    }

    public int lengths(){
        return _toyArrayList.size();
    }
}
