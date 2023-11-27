package org.example.Repeat.Lesson4.Controller;

import org.example.Repeat.Lesson4.Model.*;
import org.example.Repeat.Lesson4.Servis.DataService;
import org.example.Repeat.Lesson4.Servis.StreamService;
import org.example.Repeat.Lesson4.Servis.StudyGroupService;
import org.example.Repeat.Lesson4.View.GroupView;
import org.example.Repeat.Lesson4.View.StreamView;
import org.example.Repeat.Lesson4.View.StudentView;
import org.example.Repeat.Lesson4.View.TeacherView;

import java.util.ArrayList;

public class Controller {
    private final DataService _dataService = new DataService();
    private final StudentView _studentView = new StudentView();
    private final GroupView _groupView = new GroupView();
    private final TeacherView _teacherView = new TeacherView();
    private final StreamView _streamView = new StreamView();
    private final StudyGroupService _studyGroupService = new StudyGroupService();
    private final ArrayList<StudyGroup> _listGroup = new ArrayList<>();
    private final StreamService _streamService = new StreamService();

    public void createStudent(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Student);
    }

    public void createTeacher(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Teacher);
    }

    public void createStudentGroup1() {// упростил код был такой метод
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>(_dataService.getAllTeachers());

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Teacher) {
                teachers.add((Teacher) users.get(i));

            } else if (users.get(i) instanceof Student) {
                students.add((Student) users.get(i));
            } else ;
        }

        int countGroup = teachers.size();// количество групп
        int countStudentOfGroup = 3;// количество студентов в группе
        int index = 0;

        for (int i = 0; i < countGroup; i++) {
            Teacher teacher = teachers.get(i);
            ArrayList<Student> studentsTemp = new ArrayList<>();

            while (index < countStudentOfGroup) {
                studentsTemp.add(students.get(index));
                index++;
            }
            countStudentOfGroup += index;
            _studyGroupService.createNewGroup(studentsTemp, teacher);
            _listGroup.add(_studyGroupService.getGroup());
        }
    }

    public void createStudentGroup(int amountTeachers, int amountStudent) {// стал такой
        _streamService.createStudentGroup(amountTeachers, amountStudent);
    }

    public void showAllStudent() {
        ArrayList<Student> users = _dataService.getAllStudents();

        for (Student user : users) {
            _studentView.showStudent(user);
        }
    }

    public void showAllTeacher() {
        ArrayList<Teacher> users = _dataService.getAllTeachers();

        for (Teacher user : users) {
            _teacherView.showTeacher(user);
        }
    }

    public void showAllGroup() {
        int countGroup = _listGroup.size();

        for (int i = 0; i < countGroup; i++) {
            StudyGroup studyGroup = _listGroup.get(i);
            _groupView.showGroup(studyGroup);
        }
    }

    public void showStream() {
        int countGroup = _streamService.getCountGroup();

        for (int i = 0; i < countGroup; i++) {
            StudyGroup studyGroup = _streamService.getStudentGroup().get(i);
            _streamView.showStream(studyGroup);
        }
    }
}
