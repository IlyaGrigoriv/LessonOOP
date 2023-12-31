package org.example.Repeat.Lesson7;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> _menu ;

    public Menu(){
        _menu = new ArrayList<>();
        _menu.add("Название игрушки");
        _menu.add("Частота выпадения");
        _menu.add("Количества");
        _menu.add("что бы выйти нажмите 0");
    }

    public int lengths(){
        return _menu.size();
    }

    public void show(int index){
        System.out.println(_menu.get(index));
    }
}

