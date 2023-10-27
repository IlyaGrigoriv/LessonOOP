package org.example.Repeat.Lesson3.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Stream implements Iterable<StudentGroup> ,Comparable<Stream>{ //поток содержит группы
    private ArrayList<StudentGroup> listOfStudyGroups;//лист групп, список учебный групп
    private int countStudentGroup;
    private static int count = 0;

    public Stream(StudentGroup studentGroup) {
        this.listOfStudyGroups = new ArrayList<>(Collections.singleton(studentGroup));
        count++;
        countStudentGroup = count;
    }

    public int getAmountGroup(){
        return countStudentGroup;
    }

    public int getCountStudentGroup(){
        return countStudentGroup;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        listOfStudyGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    @Override
    public int compareTo(Stream o) {
        if (this.countStudentGroup > o.getAmountGroup()) {
            return 1;
        }else return -1;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "listOfStudyGroups=" + listOfStudyGroups +
                ", countStudentGroup=" + countStudentGroup +
                '}';
    }
}
/**
 * перечесление групп
 */

