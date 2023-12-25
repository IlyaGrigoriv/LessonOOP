package org.example.Repeat.Lesson6.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Repositories {

    public void createFile(Note note) {
        try {
            File file = new File("note.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            String text = "имя "+ note.getName() + " фамилия " + note.getSurName()
                    +" отчество " + note.getLastName() + " дата рождения "
                    +note.getData().getTime() +
                    " тел " + note.getPhoneNumber() +
                    " пол " +note.getGender();
            pw.println(text);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Ошибка "+ ex);
        }
    }
}
