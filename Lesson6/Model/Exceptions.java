package org.example.Repeat.Lesson6.Model;

public class Exceptions {
    public boolean validatyString(String str) {
        boolean resault = true;

        String str1 = stringSigns();
        String str2 = stringNumbers();
        String arr[] = check(str);
        resault = aaa(str1,str2,arr);
        return resault;
    }

    private String[] check(String str) {
        int size = str.length();
        String[] arr = new String[size];
        arr = str.split("");
        return arr;
    }

    public String stringSigns(){
        return "!@#$%^&*()+_-=";
    }

    public String stringNumbers(){
        return "1234567890";
    }

    public boolean aaa(String str1, String str2, String[] arr) {
        boolean resault = true;

        for (int i = 0; i < arr.length; i++) {
            String a = String.valueOf(arr[i]);

            if (str2.contains(a) || str1.contains(a)) {
                resault = false;
                throw new RuntimeException("Это значение " + arr[i] + " недопустимо , попробуйте еще раз.");
            } else ;
        }
        return resault;
    }

    public boolean checkInNumber(String str){
        boolean result = true;
       String [] arr = check(str);
       String str1 = stringNumbers();

        for (int i = 0; i < arr.length; i++) {
            if(str1.contains(arr[i])){
            }else return false;
        }
        return result;
    }
}
