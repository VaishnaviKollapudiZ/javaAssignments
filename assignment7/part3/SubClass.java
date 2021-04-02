package com.assignment7.part3;

public class SubClass extends SuperClass implements InterfaceCombined{

    SubClass(){System.out.println("Inside subclass");}
    @Override
    public void newMethod() {
        System.out.println("InterfaceCombined-newMethod");
    }

    @Override
    public void oneMethod1() {
        System.out.println("InterfaceOne- method1");
    }

    @Override
    public void oneMethod2() {
        System.out.println("InterfaceOne- method2");
    }

    @Override
    public void twoMethod1() {
        System.out.println("InterfaceTwo- method2");
    }

    @Override
    public void twoMethod2() {
        System.out.println("InterfaceTwo- method2");
    }
    @Override
    public void threeMethod1() {
        System.out.println("InterfaceThree- method1");
    }

    @Override
    public void threeMethod2() {
        System.out.println("InterfaceThree- method2");
    }

    public void interfaceOneMethod(InterfaceOne interfaceOne){
        interfaceOne.oneMethod1();
        interfaceOne.oneMethod2();
    }
    public void interfaceTwoMethod(InterfaceTwo interfaceTwo){
        interfaceTwo.twoMethod1();
        interfaceTwo.twoMethod2();
    }
    public void interfaceThreeMethod(InterfaceThree interfaceThree){
        interfaceThree.threeMethod1();
        interfaceThree.threeMethod2();
    }
    public void interfaceCombinedMethod(InterfaceCombined interfaceCombined){
        interfaceCombined.newMethod();
    }

}
