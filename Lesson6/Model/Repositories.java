package org.example.Repeat.Lesson6.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Repositories {
    ArrayList<Note> _repositories;

    public Repositories() {
        _repositories = new ArrayList<>();
    }

    public void add(Note note) {
        _repositories.add(note);
    }

    public void createFile(Note note) {
        try {
            File file = new File("note.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            String text = note.getName() + note.getSurName() + note.getLastName() + note.getData().getTime() + note.getPhoneNumber() + note.getGender();
            pw.println(text);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Ошибка "+ ex);
        }
    }
}
