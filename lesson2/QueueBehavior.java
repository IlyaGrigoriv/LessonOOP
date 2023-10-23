package org.example.Repeat.lesson2;

public interface QueueBehavior {
    public void update();

    public void takeInQueue(Actor actor);

    public void takeOrders();

    public void giveOrders();

    public void releaseFromQueue();
}
