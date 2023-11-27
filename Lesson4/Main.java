package org.example.Repeat.Lesson4;

import org.example.Repeat.Lesson4.Controller.Controller;
import org.example.Repeat.Lesson4.Model.Student;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Иван","Суворов");
        controller.createStudent("Илья","Григорьев");
        controller.createStudent("Лена","Васильева");

        controller.createStudent("Аня","Лазарева");
        controller.createStudent("Игорь","Ширнин");
        controller.createStudent("Петр","Цырин");

        controller.createTeacher("Елена","Петровна");
        controller.createTeacher("Василиса","Игнатьева");


//        controller.showAllStudent();
        System.out.println();
//        controller.showAllTeacher();
        controller.createStudentGroup(2,3);
        controller.showAllGroup();
//        System.out.println(----);
        controller.showStream();

    }
}
