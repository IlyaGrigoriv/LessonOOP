package org.example.Repeat.Lesson1;

import java.util.Scanner;

public  class InputUser {
    private Scanner scanner = new Scanner(System.in);

    public String inputUserString() {
        return scanner.nextLine();
    }

    public int inputUserInt() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public double inputUserDouble() {
        return scanner.nextDouble();
    }
}
