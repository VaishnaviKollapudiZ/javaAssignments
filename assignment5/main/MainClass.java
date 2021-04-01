package vaishnavi.assignment5.main;

import vaishnavi.assignment5.data.Class1;
import vaishnavi.assignment5.singleton.Class2;

public class MainClass {

    public static void main(String[] args){
        Class1 class1 = new Class1();
        class1.printInstanceVariables();
        class1.printLocalVariables();

        Class2 class2 = Class2.initializeString("Vakula");
        class2.printString();

        Class2 newClass2 = Class2.initializeString("Arjun");

        //The below two statements print the same value, because they are printing static variable
        newClass2.printString();
        System.out.println("\n");
        class2.printString();
    }
}
