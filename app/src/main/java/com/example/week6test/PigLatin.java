package com.example.week6test;

public class PigLatin {
    public static void main(String[] args) {
        String s = "chicken soup";
        s = s.toLowerCase();
        String[] words = s.split("\\s");
        String output = "";

        for (int i = 0; i < words.length; i++) {
            String pigLatinSingleWord = translateWord(words[i]);
            output += pigLatinSingleWord += " ";
        }
        System.out.println(output);
    } // end main

    public static String translateWord(String singleWord) {
        int pos = -1; // position of very first vowel

        for (int i = 0; i < singleWord.length(); i++) {
            char c = singleWord.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')  {
                pos = i;
                break;
            }
        } // end forloop

        String a = singleWord.substring(0,pos);
        String b = singleWord.substring(pos);
        String newPigLatinWord = b + a + "ay";
        return newPigLatinWord;
    } // end translateWord
}
