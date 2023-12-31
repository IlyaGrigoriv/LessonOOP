package org.example.Repeat.Lesson7;

public class Test {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Кукла",3,4);
        Toy toy2 = new Toy("Шляпа",1,5);
        Toy toy3 = new Toy("машина",5,10);
        Toy toy4 = new Toy("Пистолет",1,2);
        Toy toy5 = new Toy("меч",3,4);
        Toy toy6 = new Toy("Лук",3,4);
        Toy toy7 = new Toy("рюкзак",2,4);
        Toy toy8 = new Toy("сумка",1,3);

        ToyWarehouse toyWarehouse = new ToyWarehouse();
        toyWarehouse.add(toy1);
        toyWarehouse.add(toy2);
        toyWarehouse.add(toy3);
        toyWarehouse.add(toy4);
        toyWarehouse.add(toy5);
        toyWarehouse.add(toy6);
        toyWarehouse.add(toy7);
        toyWarehouse.add(toy8);


    }
}
