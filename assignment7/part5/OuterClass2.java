package com.assignment7.part5;

public class OuterClass2 extends OuterClass1{

    class InnerClass2 extends InnerClass1{
        InnerClass2(String text,String name){
            super(text);
            System.out.print(name);
        }

    }

}
