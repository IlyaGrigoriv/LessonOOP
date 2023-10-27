package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.Stream;
import org.example.Repeat.Lesson3.data.StudentGroup;

import java.util.ArrayList;

public class StreamService { //сущьность отвечающая за созданея и хранения потоков
    private ArrayList<StudentGroup> stream;
    private int amountStream = 0;
    private static int count = 0;

    public void createStream(StudentGroup studentGroup) {
        this.stream = new ArrayList<StudentGroup>(studentGroup);
        count++;
        amountStream = count;
    }

    public void add(StudentGroup studentGroup) {
        this.stream.add(studentGroup);
    }

    public StudentGroup getStream(int index){
        return stream.get(index);
    }

//    public ArrayList<Stream> getSortedStream() {//как отсортировать список потоков созда
//        Collections.sort(stream);
//        return stream;
//    }
}
