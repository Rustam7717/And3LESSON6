package com.example.and3lesson6;

public class CustomMath {

    public String add(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));


    }

    public String sub(String a, String b) {
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    public String mult(String a, String b) {
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    public String div(String a, String b) {
        return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
    }

    public String reverseString(String words) {
        String[] slitedWords = words.split(" ");
        return slitedWords[1] + " " + slitedWords[0];

    }
}
