package org.example.Repeat.Lesson4.Model;

import org.example.Repeat.Lesson4.Servis.DataService;

public class Validity {

    public int validity(int a, int b) {// название неправильное
        if (a <= b) {
            return a;
        } else return b;
    }

}
