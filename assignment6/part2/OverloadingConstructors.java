package com.assignment6.part2;

public class OverloadingConstructors {

    public OverloadingConstructors(){
        System.out.print("Hello ");
    }

    public OverloadingConstructors(String name){
        this(); //constructor chaining: there should be at least one constructor without 'this()'. Can be done in any order
        System.out.print(name);
    }

    public static void main(String[] args){
        OverloadingConstructors obj1 = new OverloadingConstructors("Vaishu");
    }

}
