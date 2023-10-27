package org.example.Repeat.Lesson3.controller;

import org.example.Repeat.Lesson3.data.*;
import org.example.Repeat.Lesson3.service.DataService;
import org.example.Repeat.Lesson3.service.StreamService;
import org.example.Repeat.Lesson3.service.StudentGroupService;
import org.example.Repeat.Lesson3.service.TeacherService;
import org.example.Repeat.Lesson3.view.UserView;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private final DataService teacherService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();
    private final TeacherService teacherService = new TeacherService<>();

    public void createStudent(String firstName, String secondName, String patronymic, int year, int month, int day) {
        teacherService.create(firstName, secondName, patronymic, year, month, day);
        ArrayList<Student> userList = teacherService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, int numberGroup) {
        studentGroupService.createStudentGroup(teacher, teacherService.getAll(), numberGroup);//добавляет студентов а в дате юзеры
        StudentGroup studentGroups = studentGroupService.getStudentGroup();
        userView.sendOnConsoleUserGroup(studentGroups);
    }

    public void createTeacher(String firstName, String secondName, String patronymic, int year, int month, int day) {
        teacherService.create(firstName, secondName, patronymic, year, month, day);
        ArrayList<Teacher> userList = teacherService.getAll();
        userView.sendOnConsole(userList);
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

    public void createStream(StudentGroup studentGroup) {
        streamService.createStream(studentGroup);
    }

    public void addGroupInStream(StudentGroup studentGroup) {
        streamService.add(studentGroup);
    }

    public StudentGroup getStudentGroup() {
        return studentGroupService.getStudentGroup();
    }


    public void sortStream(){
//        streamService.getSortedStream();
    }

    public void view() {
        userView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
        System.out.println();
        userView.sendOnConsoleStream(streamService.getStream());
    }
}
