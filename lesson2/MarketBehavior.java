package org.example.Repeat.lesson2;

import java.util.ArrayList;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);//заходить в рынок

    void releaseFromMarket(ArrayList<Actor> actors);//выходить из рынка

    void update();//обновление состояния магазина
}
