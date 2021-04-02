package com.assignment8;

public class InsufficientWeightException extends Exception{

    public InsufficientWeightException(String errorMsg){
        super(errorMsg);
    }
}
