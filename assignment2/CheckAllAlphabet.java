package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAllAlphabet {


    static boolean checkAlphabet(String text){

        boolean[] checkAlphabet = new boolean[26];
        Arrays.fill(checkAlphabet,false);

        for(char letter : text.toCharArray()) {
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                checkAlphabet[letter - 'a'] = true;
            }
        }

        for(boolean alphabet :checkAlphabet)
            if(!alphabet) return false;
        return true;

    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if(checkAlphabet(text))
            System.out.println(text + " consists all the alphabet");
        else System.out.println(text +" does not consist all the alphabet");
    }

    /*Time Complexity = O(n), depends on the length of the input string, traverse every character to see if it is a alphabet or not.
    * Space Complexity = O(1), using an array of fixed size.
    * */
}

