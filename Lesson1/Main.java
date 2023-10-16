package org.example.Repeat.Lesson1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new HotDrink("Чай", 20, 0.5);
        product1.show();
        Product product2 = new BottleOfWater("Бон Аква", 120, 0.5);
        product2.show();
        Product product3 = new BottleOfWater("Акваминирали", 100, 0.4);
        product3.show();
        Product product4 = new HotDrink("Кофе", 220, 0.3);
        product4.show();

        vendingMachine.add(product1);
        vendingMachine.add(product2);
        vendingMachine.add(product3);
        vendingMachine.add(product4);

        vendingMachine.start();

    }
}
/**
 * автомат с водой продает и холодный напитки и горячие
 * 1 продукт бутылки с разным объемом
 * 2 продуктов название, цена, объем, температура если это горячий напиток
 * 3 аппарат с содержимым
 */
