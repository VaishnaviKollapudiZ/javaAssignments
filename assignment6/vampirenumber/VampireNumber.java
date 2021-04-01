package com.assignment6.vampirenumber;


import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber {

    public static boolean checkVampireNumbers(int number) {

        String numString = String.valueOf(number);

        if(numString.length()%2 !=0 )
            return false;
        String[] arr = numString.split("");
        String[] newArr = new String[arr.length];
        Arrays.sort(arr);

        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                if ((index + "").length() == (number / index + "").length()) {
                    String factor1 = index+"";
                    String factor2 = (number/index)+"";
                    if(!factor1.endsWith("0") || !factor2.endsWith("0")) {
                        newArr = ((index + "") + (number / index + "")).split("");
                        Arrays.sort(newArr);
                        if (Arrays.equals(arr, newArr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<String> vampireNumbers = new ArrayList<>();
        int number = 1000;
        while(vampireNumbers.size() <100){
            if(checkVampireNumbers(number))
                vampireNumbers.add(String.valueOf(number));
            number++;
        }

        for(String numString: vampireNumbers){
            System.out.println(numString);
        }
    }
}







