package org.example.Repeat.Lesson3.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {
    private int studentId;
    private static int counter = 0;

    protected Student(String firstName, String secondName, String patronymic, int year, int month, int day) {
        super(firstName, secondName, patronymic, year, month, day);
        counter++;
        studentId = counter;
    }

    public int getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.studentId > student.getStudentId()) {
            return 1;
        }else return -1;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.studentId.compareTo(o.studentId);
//    }
}
