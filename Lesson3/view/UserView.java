package org.example.Repeat.Lesson3.view;

import org.example.Repeat.Lesson3.data.Student;
import org.example.Repeat.Lesson3.data.StudentGroup;
import org.example.Repeat.Lesson3.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(ArrayList<Student> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
