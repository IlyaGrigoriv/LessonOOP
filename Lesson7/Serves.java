package org.example.Repeat.Lesson7;

import java.util.Random;

public class Serves {
    private ToyWarehouse _toyWarehouse = new ToyWarehouse();

    private int generatorNumbers(int count) {
        Random rnd = new Random();
        return rnd.nextInt(0, count);
    } //случайное число

    public Toy randomSelection(int count) {
        return _toyWarehouse.getToy(generatorNumbers(count));
    }//случайный выбор

    public void addToy(Toy toy) {
        _toyWarehouse.add(toy);
    }//добавление игрушек

    private Toy getToy(int index) {
        return _toyWarehouse.getToy(index);
    }

    public void draw() {
        boolean isRun = true;
        while (isRun){
            Toy toy = randomSelection(_toyWarehouse.lengths());




            toy.toString();
        }
    }//розыгрыщ
}
