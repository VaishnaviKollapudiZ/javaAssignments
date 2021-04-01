package com.assignment1;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFile {

    private static final File homeDirectory = new File("/home/vaisk/Downloads");

    public static void getMatchedFiles()
    {

        while (true) {
            System.out.println("Enter N to exit :");
            Scanner scanner = new Scanner(System.in);
            String regex = scanner.nextLine();
            if(regex.equals("N"))
                break;
            Pattern pattern = Pattern.compile(regex);//Creating pattern with given input regex
            getAbsolutePath(homeDirectory, pattern);
        }
    }
    public static void getAbsolutePath(File directory,Pattern pattern){

        File[] fileList = directory.listFiles();

        for (File file : fileList) {
            if (file.isDirectory())
                getAbsolutePath(file,pattern);/*if it is a directory, we should again go through all the files in that,
                                                so called getAbsolutePath() recursively.*/

            else {
                Matcher matcher = pattern.matcher(file.getName()); //if not a directory,check whether the fileName matches the regex
                if(matcher.find())
                    System.out.println(file.getAbsolutePath());//print absolute path
            }
        }
    }
    public static void main(String[] args)
    {
        getMatchedFiles();
    }
}


