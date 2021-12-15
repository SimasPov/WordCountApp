package com.example.wordcountapp;

import android.widget.Toast;


public class TextCounter {
    public static int getCharCount (String input) {
        if (input == null) {
            return -1;
        }
        else {
            return input.length();
        }
    }

    public static int getWordCount (String input) {
        input = input.trim();
        if(input.isEmpty()) {
            return 0;
        }
        String[] arrOfStr = input.split("[, .]+");
        return arrOfStr.length;

    }
}
