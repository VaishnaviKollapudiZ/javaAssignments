package com.assignment7.part1;

public class Mouse extends Rodent{

    Mouse(){
        System.out.println("Inside Mouse class");
    }

    @Override
    void lifeSpan() {
        System.out.println("Mouse life span = 1-2 years");
    }
}
