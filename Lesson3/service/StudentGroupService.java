package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.Student;
import org.example.Repeat.Lesson3.data.UserComparator;
import org.example.Repeat.Lesson3.data.StudentGroup;
import org.example.Repeat.Lesson3.data.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, ArrayList<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();

        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public ArrayList<Student> getSortedStudentGroup(){
        ArrayList<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public ArrayList<Student> getSortedByFIOStudentGroup(){
        ArrayList<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<>());
        return students;
    }
}
