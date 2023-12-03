package org.example.Repeat.Lesson5.Calculator1;

public class Main {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        boolean inRun = true;
        while (inRun) {
            Controller controller = new Controller();
            controller.start();
        }
    }
}
