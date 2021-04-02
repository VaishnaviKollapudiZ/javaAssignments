package com.assignment6.part3;

public class TestMain {
    public static void main(String[] args){

        ObjectReferences[] objectReferences = new ObjectReferences[3];
        //The above statement is not creating any object, so the reference points to null.
        //The constructor can work only when the object memory is created inside a heap

        objectReferences[0] = new ObjectReferences("Hi");
        objectReferences[1] = new ObjectReferences("Hello");
        objectReferences[2] = new ObjectReferences("Hey");
        //Now the references are referring to the created object having a memory. This prints the String argument given.
    }
}
