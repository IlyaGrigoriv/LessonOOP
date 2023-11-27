package org.example.Repeat.Lesson4.Model;

import java.util.ArrayList;

public class Stream {
    private ArrayList<StudyGroup>  _stream;
    public Stream(){
        _stream = new ArrayList<>();
    }

    public void add(StudyGroup studyGroup){
        _stream.add(studyGroup);
    }

    public void showStream(){
        for (int i = 0; i < _stream.size(); i++) {
            StudyGroup studyGroup = _stream.get(i);
            studyGroup.showGroup();
        }
    }
}
