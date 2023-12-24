package org.example.Repeat.Lesson6.Model;

public class Exceptions {


    public static void showException(String str) {
        System.out.println("Это значение " + str + " недопустимо , попробуйте еще раз.");
    }

    public static void incorrectMinValueNumbers(){
        System.out.println("В вашем номере мало цифр");
    }

    public static void incorrectMaxValueNumbers(){
        System.out.println("В вашем номере много цифр");
    }

}
