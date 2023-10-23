package org.example.Repeat.lesson2;

public interface ActorBehavior {
    /**
     * встать в очередь
     * сделать заказ
     * забрать заказ
     * выйти из очереди
     */
    public void setMakeOrder(Boolean makeOrder);//сделать заказ
    public void setTakeOrder(Boolean takeOrder); //забрать заказ
    public boolean isMakeQueue();//стоит в очереди
    public boolean isTakeQueue();// покинул очередь
}
