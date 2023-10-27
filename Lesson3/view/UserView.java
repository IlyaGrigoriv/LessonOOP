package org.example.Repeat.Lesson3.view;

import org.example.Repeat.Lesson3.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserView <T extends User>{

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(ArrayList<T> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
        System.out.println();
    }

    public void sendOnConsoleListStudent(List<T> students){
        logger.info(students.toString());
        System.out.println();
    }

    public void sendOnConsoleStream(Stream stream){
        logger.info(stream.toString());
        System.out.println();
    }

    public void sendOnConsoleTeacher(Teacher teacher){
        logger.info(teacher.toString());
        System.out.println();
    }
}
