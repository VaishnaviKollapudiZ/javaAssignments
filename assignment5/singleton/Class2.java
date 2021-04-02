package vaishnavi.assignment5.singleton;

public class Class2 {

//    private String instanceStringVariable;
//
//      public static Class2 initializeString(String initialString){
//        this.instanceStringVariable = initialString;
//        return new Class2();
//    }

    /* The statement at line 8 throws an error, because this cannot be referenced from a static context,
       if you remove this keyword, it will still show an error that instanceStringVariable cannot be referenced from a static context.
       This is because static methods can operate only on static attributes. So make instanceStringVariable as static.
     */

    private static String instanceStringVariable;

    public static Class2 initializeString(String initialString){
        instanceStringVariable = initialString;
        return new Class2();
    }
    public void printString(){
        System.out.println(instanceStringVariable);
    }


}