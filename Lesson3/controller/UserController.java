package org.example.Repeat.Lesson3.controller;

import org.example.Repeat.Lesson3.data.*;
import org.example.Repeat.Lesson3.service.DataService;
import org.example.Repeat.Lesson3.service.StreamService;
import org.example.Repeat.Lesson3.service.StudentGroupService;
import org.example.Repeat.Lesson3.view.UserView;

import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, int year, int month, int day) {
        dataService.create(firstName, secondName, patronymic, year, month, day);
        ArrayList<Student> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher) {
        studentGroupService.createStudentGroup(teacher, dataService.getAll());//добавляет студентов а в дате юзеры
    }

    public Student getStudentInStudentGroup(String firstName, String secondName) {
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup() {
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup() {
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public void createStream(Stream stream){
        streamService.createStream(stream);
    }

    public void sortStream(){
        streamService.getSortedStream();
    }

    public void view(){
        userView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }
}
