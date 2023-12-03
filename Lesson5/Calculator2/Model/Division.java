package org.example.Repeat.Lesson5.Calculator2.Model;

public class Division implements Action {
    @Override
    public void action(int a, int b) {
        int c = a / b;
        System.out.println(a + "/"+ b +"=" + c);
    }
}
