package com.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regEx = "^A[^.]*\\.$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches())
            System.out.println("Convention followed !!");
        else System.out.println("Convention not followed !!");

    }


}
