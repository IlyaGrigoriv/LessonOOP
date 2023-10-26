package org.example.Repeat.Lesson3.service;

import org.example.Repeat.Lesson3.data.Stream;
import org.example.Repeat.Lesson3.data.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StreamService { //сущьность отвечающая за созданея и хранения потоков
    private ArrayList<Stream> stream;
    private int amountStream ;
    private static int count = 0;
    public void createStream(Stream stream){
        this.stream = new ArrayList<>();
        count++;
        amountStream = count;
    }

    public void add(Stream stream){
        this.stream.add(stream);
    }

    public ArrayList<Stream> getSortedStream(){//как отсортировать список потоков созда
        Collections.sort(stream);
        return stream;
    }
}
