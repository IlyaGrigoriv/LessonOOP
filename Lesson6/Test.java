package org.example.Repeat.Lesson6;
import org.example.Repeat.Lesson6.Model.Exceptions;
import org.example.Repeat.Lesson6.Model.Gender;
import org.example.Repeat.Lesson6.Model.Note;
import org.example.Repeat.Lesson6.Model.Repositories;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
//        testNumberPhone();
//        testWriteFile();
//        testString();
//        testGender();
    }

    public static void testWriteFile(){
        Repositories repositories = new Repositories();

    }

    public static void testGender(){
        String str = "g";
        Check check = new Check();
        System.out.println(check.genderInputCheck(str));

    }

    public static void testNumberPhone(){
        String strPhone = "11111213248144";
        Check check = new Check();
        System.out.println(check.phoneCheck(strPhone));
    }


    public static void testString(){
        String [] arr = {"bkmz","Илья","!№"};

        System.out.println("Начало==========================================");

        for (int i = 0; i < arr.length; i++) {
            Check check = new Check();
            System.out.println(arr[i]+ " проверяемое");
            System.out.println(check.stringCheck(arr[i])+" проверка "+arr [i]);

//            System.out.println(exception.matchCheсking(exception.lettersEngTest(),
//                    exception.splitsStringIntoAnArray(arr[i]))+" проверка eng буквы "+ arr[i]);
//            System.out.println("====");
//            System.out.println(exception.matchCheсking(exception.lettersRusForTest(),
//                    exception.splitsStringIntoAnArray(arr[i]))+" проверка rus буквы "+ arr[i]);
//            System.out.println("====");
//            System.out.println(exception.matchCheсking(exception.numbersOfTheTest(),
//                    exception.splitsStringIntoAnArray(arr[i]))+" проверка цифры "+ arr[i]);
//            System.out.println("====");
//            System.out.println(exception.matchCheсking(exception.signsForTheTest(),
//                    exception.splitsStringIntoAnArray(arr[i]))+" проверка на символы "+ arr[i]);
        }
        System.out.println("Конец=================================================");

    }
}
