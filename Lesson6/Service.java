package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.Menu;
import org.example.Repeat.Lesson6.Model.Note;
import org.example.Repeat.Lesson6.Model.Repositories;

public class Service {
    private Menu _menu = new Menu();
    private Input _input =new Input();
    private Repositories _repositories = new Repositories();
    private View _view = new View();

    public boolean createNewEntry(){
        int countInput = 7;
        String [] arr = new String[countInput];

        for (int i = 0; i < _menu.getSize(); i++) {
            System.out.println(_menu.getMenu(i));
            String str = _input.inputString();
            arr [i] = str;
        }
        Note note = new Note (arr[0], arr[1],arr[2],arr[3],arr[4],arr[5]);
        _repositories.add(note);
        return whileStop(arr);
    }

    private boolean whileStop(String [] arr){
        if(arr[6].equals("0")) {
            return false;
        }else return true;
    }

    public void checkValidate() {
    }

    public void showNote(){
        for (int i = 0; i < _repositories.getSize(); i++) {
            Note note = _repositories.getNote(i);
            note.toString();
        }
    }

    public void add(Note note){
        _repositories.add(note);
    }
}
