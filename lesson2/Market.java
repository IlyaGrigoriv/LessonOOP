package org.example.Repeat.lesson2;

import java.util.ArrayList;
import java.util.Random;

public class Market implements MarketBehavior, QueueBehavior {// рынок
    private final ArrayList<Actor> _queue;

    public Market() {
        _queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(ArrayList<Actor> actors) {
        for (Actor actor: actors){
            _queue.remove(actor);
            System.out.println(actor.getName()+ " вышел из магазина ");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь ");
        _queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : _queue) {
            if (!actor._isMakeOrder) {                  //хз
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "Сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : _queue) {
            if (actor._isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        ArrayList<Actor> actorList = new ArrayList<>();
        for (Actor actor : _queue) {
            if (actor._isMakeOrder){
                actorList.add(actor);
                System.out.println(actor.getName()+ " Вышел из очереди ");
            }
        }
        releaseFromMarket(actorList);
    }
}
