package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.Menu;
import org.example.Repeat.Lesson6.Model.Note;

public class Controller {
    final Service _service = new Service();

    public void start(){
        _service.createNewEntry();
        _service.checkValidate();
        // проброс новых значений
    }
}
