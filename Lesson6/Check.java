package org.example.Repeat.Lesson6;

import org.example.Repeat.Lesson6.Model.Exceptions;

public class Check {
    public boolean stringCheck(String lineToCheck) {
        boolean result = false;
        lineToCheck = lineToCheck.toLowerCase();
        String arr[] = splitsStringIntoAnArray(lineToCheck);

        // проверка строки
        if (!matchCheсking(signsForTheTest(), arr) && !matchCheсking(numbersOfTheTest(), arr) && !matchCheсking(lettersEngTest(), arr)) {//проверка на символы и цифры
            result = true;
        } else ;
        return result;
    }

    public boolean phoneCheck(String lineToCheck) {
        boolean result = false;
        lineToCheck = lineToCheck.toLowerCase();
        String arr[] = splitsStringIntoAnArray(lineToCheck);

        if (!matchCheсking(signsForTheTest(), arr) && !matchCheсking(lettersRusForTest(), arr) && !matchCheсking(lettersEngTest(),arr)) {
            if (lineToCheck.length() == 11) {
                result = true;
            }else if (lineToCheck.length() < 11){
                Exceptions.incorrectMinValueNumbers();
            }else Exceptions.incorrectMaxValueNumbers();
        }

        return result;
    }



    public boolean matchCheсking(String stringToBeCheck, String[] lineToCheck) {// проверка на совпадения
        boolean result = false;

        for (int i = 0; i < lineToCheck.length; i++) {
            String a = String.valueOf(lineToCheck[i]).toLowerCase();

            if (stringToBeCheck.contains(a)) {
                result = true;
                Exceptions.showException(a);
                i = lineToCheck.length;
            } else ;
        }
        return result;
    }


    public String signsForTheTest() {
        return "!@#$%^&*()+_-=,";
    }

    public String numbersOfTheTest() {
        return "1234567890";
    }

    public String lettersRusForTest() {
        return "йцукенгшщзхъфывапролджэячсмитьбю";
    }

    public String lettersEngTest() {
        return "qwertyuiopasdfghjklzxcvbnm";
    }

    public String[] splitsStringIntoAnArray(String str) {//разбиваем строку на массив
        int size = str.length();
        String[] arr = new String[size];
        arr = str.split("");
        return arr;
    }

    private boolean floorCheck(String gender) {
        return (gender.equals("м") || gender.equals("ж"));
    }

    public boolean genderInputCheck(String gender) {
        if (!floorCheck(gender)) {
            Exceptions.showException(gender);
            return false;
        } else ;
        return true;
    }
}
