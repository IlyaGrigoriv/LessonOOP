package org.example.Repeat.Lesson5.Calculator2;

import org.example.Repeat.Lesson5.Calculator2.Model.Action;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private final View _view = new View();
    private final Serves _serves = new Serves();
    private final Input _input = new Input();

    public void start() {
        boolean isRun = true;

        while (isRun) {
            _view.inputNumbers();
            int a = _input.numbers();
            _view.inputNumbers();
            int b = _input.numbers();
            _view.inputAction();
            int c = _input.numbers();

            if (c != 0) {
                Action action = _serves.getAction(c);
                action.action(a, b);
            } else isRun = false;
        }
    }
}
