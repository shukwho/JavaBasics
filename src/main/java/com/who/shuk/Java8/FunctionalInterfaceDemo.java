package com.who.shuk.Java8;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        int a=5;
        FI fi = x->x*x; //creating instance of functional interface using Lambda expression
        int i = fi.abstractMethod(a);//calling the abstract method using the instance created
        System.out.println(i);
    }

}

@java.lang.FunctionalInterface
interface FI{
    int abstractMethod(int x);
}
