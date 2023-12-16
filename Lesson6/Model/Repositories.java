package org.example.Repeat.Lesson6.Model;

import java.util.ArrayList;

public class Repositories {
    ArrayList<Note> _repositories;

    public Repositories(){
        _repositories = new ArrayList<>();
    }

    public void add(Note note){
        _repositories.add(note);
    }

    public Note getNote(int index){
        return _repositories.get(index);
    }

    public int getSize(){
        return _repositories.size();
    }
}
