package com.assignment4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KycDateRange {

    public static void printRange(Calendar startDate,Calendar closeDate){

        System.out.print(startDate.get(Calendar.DATE)+"-"+startDate.get(Calendar.MONTH)+"-"+startDate.get(Calendar.YEAR)+" ");
        System.out.println(closeDate.get(Calendar.DATE)+"-"+closeDate.get(Calendar.MONTH)+"-"+closeDate.get(Calendar.YEAR)+" ");
    }
    public static void checkDateRange(){

        Scanner scan = new Scanner(System.in);
        //int testCases = scan.nextInt();//creating problem in while loop
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases >0) {

            String[] dates = scan.nextLine().split(" ");

            String[] signUp = dates[0].split("-");
            String[] current = dates[1].split("-");


            Calendar currentDate = Calendar.getInstance();
            currentDate.set(Integer.parseInt(current[2]), Integer.parseInt(current[1]), Integer.parseInt(current[0]));

            Calendar signUpDate = Calendar.getInstance();
            signUpDate.set(Integer.parseInt(signUp[2]), Integer.parseInt(signUp[1]), Integer.parseInt(signUp[0]));


            Calendar startRange = Calendar.getInstance();
            startRange = (Calendar) signUpDate.clone();
            startRange.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            startRange.add(Calendar.DATE, -30);

            Calendar closeRange = Calendar.getInstance();
            closeRange = (Calendar) signUpDate.clone();
            closeRange.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            closeRange.add(Calendar.DATE, +30);

            if (signUpDate.get(Calendar.YEAR) >= currentDate.get(Calendar.YEAR) || startRange.after(currentDate)) {
                System.out.println("No range");
            }
            else if(currentDate.after(startRange)){
                if (currentDate.before(closeRange)) {
                    closeRange = currentDate;
                    printRange(startRange, closeRange);
                } else
                    printRange(startRange, closeRange);
            }
            testCases--;
        }

    }
    public static void main(String[] args){
        checkDateRange();
    }
}
