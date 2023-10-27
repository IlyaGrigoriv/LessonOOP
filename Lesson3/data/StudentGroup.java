package org.example.Repeat.Lesson3.data;


import java.util.ArrayList;

public class StudentGroup implements Iterable<Student> {
    private ArrayList<Student> students;
    private Teacher teacher;
    private int numbersGroup;
    private static int counter = 100;

    public StudentGroup(Teacher teacher, ArrayList<Student> students, int numbersGroup) {
        this.students = students;
        this.teacher = teacher;
        counter++;
        this.numbersGroup = numbersGroup;
    }

    public StudentGroup(Teacher teacher){
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.numbersGroup = counter;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getNumbersGroup() {
        return numbersGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                ", numbersGroup=" + numbersGroup +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}

