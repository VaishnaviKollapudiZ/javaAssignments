package com.assignment7.part5;

public class NestedClassesMain {

    public static void main(String[] args){
        OuterClass1.InnerClass1 obj1 = new OuterClass1().new InnerClass1("Welcome");
        OuterClass1.InnerClass1 obj2 = new OuterClass2().new InnerClass2("Welcome","Vakula");

        obj1.printOperation(1,2);
        obj2.printOperation(3,4); //RunTime Polymorphism
    }
}
