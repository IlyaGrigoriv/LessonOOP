package org.example.Repeat.Lesson3.data;


import java.util.ArrayList;

public class StudentGroup implements Iterable<Student> {
    private ArrayList<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, ArrayList<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}

