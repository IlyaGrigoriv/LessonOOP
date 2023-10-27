package org.example.Repeat.Lesson3;


import org.example.Repeat.Lesson3.controller.UserController;
import org.example.Repeat.Lesson3.data.Student;
import org.example.Repeat.Lesson3.data.Teacher;
import org.example.Repeat.Lesson3.data.User;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createStudent("Иван", "Суворов", "Владимирович", 1981, 12, 3);
        userController.createStudent("Саша", "Бровкин", "Алексеевич", 1980, 3, 4);
        userController.createStudent("Лена", "Журавлева", "Владимировна", 1979, 5, 6);
        Teacher teacher = new Teacher("Наталья", "Бойко", "Леонидовна", 1970, 1, 1);
        System.out.println();
        userController.createStudentGroup(teacher,11);

        userController.createStudent("Васильев", "Иван", "Иванович", 1981, 12, 3);
        userController.createStudent("Ленин", "Владимир ", "Ильич", 1980, 3, 4);
        userController.createStudent("Евгений", "Кузнецов", "Владимировна", 1979, 5, 6);
        Teacher teacher2 = new Teacher("Елана", "Васильевна", "Семанюк", 1970, 1, 1);
        userController.createStudentGroup(teacher2,12);

        userController.createStream(userController.getStudentGroup());

        userController.view();


    }
}
