package com.technicalquestions;

public class ReverseString {

    public ReverseString() {
    }

    public String ReverseString(String s){
        char[] characters = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters[j++] = s.charAt(i);
        }

        return new String(characters);
    }
}
