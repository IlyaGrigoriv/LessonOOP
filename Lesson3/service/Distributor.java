package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.Student;
import org.example.Repeat.Lesson3.data.StudentGroup;
import org.example.Repeat.Lesson3.data.Teacher;

import java.util.ArrayList;

public class Distributor {
    public ArrayList<StudentGroup> distributorByGroup(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        int amountGroup = teachers.size();
        int countStudy = students.size() / amountGroup;
        int index = 0;

        ArrayList<StudentGroup> listGroup = new ArrayList<>();

        for (int i = 0; i < amountGroup; i++) {
            Teacher teacher = teachers.get(i);
            StudentGroup group = new StudentGroup(teacher);
            listGroup.add(group);
        }
        for (int j = 0; j < listGroup.size(); j++) {
            StudentGroup group = listGroup.get(j);

            for (int i = index; i < countStudy; i++) {
                Student student = students.get(i);// сделать диапозон
            }
            index += countStudy;
        }
        if ((countStudy % 2) != 0 || (amountGroup % 2) != 0) {//добавляем последнего нечетного студента в последнию группу
            StudentGroup studentGroup = listGroup.get(listGroup.size());
            studentGroup.setStudents(students.get(students.size()));
        }
        return listGroup;
    }

    public void distributorByStream(ArrayList<StudentGroup> listGroups) {
        int amountStream = 0;

        for (int i = 0; i < listGroups.size(); i++) {
            StudentGroup studentGroup = listGroups.get(i);
            int numberGroup = studentGroup.getNumbersGroup();
            StreamService streamService = new StreamService();

        }

        /**
         * 1 вытаскиваем номер группы
         * 2 формируем в соответствии с первой цифры группы
         */
    }
}