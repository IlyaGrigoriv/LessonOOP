package org.example.Repeat.Lesson6.Model;

public class Exceptions {
    public boolean stringCheck(String lineToCheck) {
        boolean result = false;
        lineToCheck = lineToCheck.toLowerCase();

        if (numbersOfTheTest().equals(lineToCheck.charAt(0))) {//проверка телефона
            String arr[] = splitsStringIntoAnArray(lineToCheck);

            if (!matchCheсking(signsForTheTest(), arr) || !matchCheсking(lettersForTest(), arr)) {
                result = true;
            }
        } else if (lettersForTest().equals(lineToCheck.charAt(0))) { // проверка на символы и цифры
            String arr[] = splitsStringIntoAnArray(lineToCheck);

            if(!matchCheсking(signsForTheTest(),arr) || !matchCheсking(numbersOfTheTest(),arr)){
                result = true;
            }
        }else ;
        return result;
    }

    private String[] splitsStringIntoAnArray(String str) {//разбиваем строку на массив
        int size = str.length();
        String[] arr = new String[size];
        arr = str.split("");
        return arr;
    }

    private boolean matchCheсking(String stringToBeCheck, String[] lineToCheck) {// проверка на совпадения
        boolean result = true;

        for (int i = 0; i < lineToCheck.length; i++) {
            String a = String.valueOf(lineToCheck[i]);

            if (stringToBeCheck.contains(a)) {
                result = false;
                throw new RuntimeException("Это значение " + lineToCheck[i] + " недопустимо , попробуйте еще раз.");
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

    public String lettersForTest() {
        return "йцукенгшщзхъфывапролджэячсмитьбю";
    }

    private boolean floorCheck(String gender){
        return (gender.equals("м") || gender.equals("ж"));
    }

    public boolean genderInputCheck(String gender){
        if(!floorCheck(gender)){
            throw new RuntimeException("Это значение " + gender + " недопустимо , попробуйте еще раз.");
        }else ;
        return true;
    }
}
