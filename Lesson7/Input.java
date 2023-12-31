package org.example.Repeat.Lesson7;

import java.util.Scanner;

public class Input {
    private Menu _menu = new Menu();
    private Scanner _scanner = new Scanner(System.in);

    public Toy newToy() {
        _menu.show(0);
        String name = _scanner.nextLine();
        _menu.show(1);
        int winningFrequency = _scanner.nextInt();
        _menu.show(2);
        int count = _scanner.nextInt();
        Toy toy = new Toy(name,winningFrequency,count);
        return toy;
    }

    public int inputInt(){
        return _scanner.nextInt();
    }
}
