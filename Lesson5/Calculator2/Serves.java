package org.example.Repeat.Lesson5.Calculator2;

import org.example.Repeat.Lesson5.Calculator2.Model.*;

import java.util.ArrayList;

public class Serves {
    private ArrayList<Action> _gens = new ArrayList<>();

    public Serves() {
        _gens.add(new Subtraction());
        _gens.add(new Addition());
        _gens.add(new Multiplication());
        _gens.add(new Division());
    }

    public Action getAction(int c){
       return  _gens.get(c-1);
    }
}
