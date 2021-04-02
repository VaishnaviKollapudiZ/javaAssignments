package vaishnavi.assignment5.data;

public class Class1 {

    private int instanceIntVariable;
    private char instanceCharVariable;


    //methods made public because, the main method is in another package, so we should public.

     public void printInstanceVariables(){
        System.out.println(instanceIntVariable);
        System.out.println(instanceCharVariable);
    }
     public void printLocalVariables(){

        /*int localIntVariable;
        char localCharVariable;
        System.out.println(localIntVariable);
        System.out.println(localCharVariable);*/

        //The above two print statements throw an error; Local variables are not initialised with a default value, unlike the class and instance variables.

         int localIntVariable = 10;
         char localCharVariable = 'V';
         System.out.println(localIntVariable);
         System.out.println(localCharVariable);
    }
}
