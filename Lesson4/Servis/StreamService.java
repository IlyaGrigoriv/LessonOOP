package org.example.Repeat.Lesson4.Servis;

import org.example.Repeat.Lesson4.Model.*;

import java.util.ArrayList;

public class StreamService {
    private StudyGroupService _studyGroupService = new StudyGroupService();
    private Validity _validity = new Validity();
    private DataService _dataService = new DataService();
    private ArrayList<StudyGroup> _listGroup = new ArrayList<>();

    public void createStudentGroup(int amountTeachers, int amountStudent) {// стал такой
        int index = 0;
        amountTeachers = _validity.validity(amountTeachers, _dataService.getAmountTeachers());
        amountStudent = _validity.validity(amountStudent, _dataService.getAmountStudents());

        for (int i = 0; i < amountTeachers; i++) {
            Teacher teacher = _dataService.getAllTeachers().get(i);
            ArrayList<Student> studentsTemp = new ArrayList<>();

            while (index < amountStudent && index<=_dataService.getAmountStudents()) {
                studentsTemp.add(_dataService.getAllStudents().get(index));
                index++;
            }
            amountStudent += index;
            _studyGroupService.createNewGroup(studentsTemp, teacher);
            _listGroup.add(_studyGroupService.getGroup());
        }
    }

    public int getCountGroup(){
        return _listGroup.size();
    }

    public ArrayList<StudyGroup> getStudentGroup(){
        return _listGroup;
    }
}
