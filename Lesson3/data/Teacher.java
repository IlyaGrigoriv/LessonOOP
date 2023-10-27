package org.example.Repeat.Lesson3.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;
    private static long amount = 1;

    public Teacher(String firstName, String secondName, String patronymic, int year, int month, int day) {
        super(firstName, secondName, patronymic, year, month, day);
        amount++;
        teacherId = amount;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
