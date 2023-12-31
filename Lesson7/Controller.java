package org.example.Repeat.Lesson7;

public class Controller {
    final Input _input = new Input();
    final Serves _serves = new Serves();

    public void start() {
        boolean isRun ;

        do {
            Toy toy = _input.newToy();
            _serves.addToy(toy);
            isRun = startStop();
        } while (isRun);
    }

    private boolean startStop() {
        Menu menu = new Menu();
        menu.show(3);

        int a = _input.inputInt();
        if (a == 0) {
            return false;
        } else return true;
    }

}
