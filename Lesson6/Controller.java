package org.example.Repeat.Lesson6;

public class Controller {
    final  Service _service = new Service();

    public void start(){
        inputNewRecord();
    }

    public void inputNewRecord(){
        boolean isRun = true;
        do {
            isRun =_service.createNote();
        }while (isRun);
    }
}
