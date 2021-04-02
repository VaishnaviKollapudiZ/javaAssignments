package com.assignment7.part5;

public class OuterClass1 {

    class InnerClass1{

        InnerClass1(String text){
            System.out.print(text +" -> OuterClass1.InnerClass1 ");
        }
        void printOperation(int num1,int num2 ){
            System.out.println(num1+num2+"\n");
        }

    }
}
