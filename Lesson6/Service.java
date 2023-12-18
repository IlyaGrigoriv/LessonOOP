package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.*;

public class Service {
    private Menu _menu = new Menu();
    private Input _input = new Input();
    private Repositories _repositories = new Repositories();
    private View _view = new View();

    public boolean createNote() {
        Note note = new Note(_input.newName(0)
                , _input.newName(1)
                , _input.newName(2)
                , _input.newName(3)
                , _input.newData(4)
                , _input.Gender(5));
        _menu.getMenu(6);
        String stop = _input.inputString();
        _repositories.add(note);
        return stopInput(stop);
    }

    public void showNote() {
        for (int i = 0; i < _repositories.getSize(); i++) {
            Note note = _repositories.getNote(i);
            note.toString();
        }
    }

    public void add(Note note) {
        _repositories.add(note);
    }

    public boolean stopInput(String str) {
        if (str.equals("0")) {
            return false;
        } else return true;
    }
}
