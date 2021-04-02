package com.assignment8;

public class ProductWeightCheck {

    public static void productCheck(int weightKgs) throws InsufficientWeightException,ExcessiveWeightException,InvalidWeightException{

        if(weightKgs == 0)
            throw new InvalidWeightException("Invalid weight");
        else if(weightKgs < 25)
            throw new InsufficientWeightException("Under weight");
        else if(weightKgs >75)
            throw new ExcessiveWeightException("Excessive weight");
        else
            System.out.println(weightKgs +" Kgs can be processed for shipping.");
    }
    public static void main(String[] args) {

        try {
            productCheck(20);
        }catch(Exception exception){ //Exception -> for considering NullPointerException too.
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("Thank you for checking in!!");
        }

    }
}


