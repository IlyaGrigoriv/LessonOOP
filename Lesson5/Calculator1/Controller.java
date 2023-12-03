package org.example.Repeat.Lesson5.Calculator1;

import org.example.Repeat.Lesson5.Calculator1.View.ShowMenu;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final ShowMenu _showMenu = new ShowMenu();
    private final Model _model = new Model();
    private int a;
    private int b;

    public void start() {
        inputOfNumbersFromTheUser();
        int action = scannerNumbers();

        switch (action) {
            case 1:
                _model.subtraction(a, b);
                break;
            case 2:
                _model.division(a, b);
                break;
            case 3:
                _model.multiplication(a, b);
                break;
            case 4:
                _model.addition(a, b);
                break;
            default:
                System.out.println("Вы ввели неправильное действие ");
        }
    }

    private int scannerNumbers() {
        int inputUser = scanner.nextInt();
        return inputUser;
    }

    private void inputOfNumbersFromTheUser() {
        _showMenu.inputNumber();
        a = scannerNumbers();
        _showMenu.inputNumber();
        b = scannerNumbers();
        _showMenu.menu();
    }
}
