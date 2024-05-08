package com.who.shuk.exceptionHandling;

public class ExceptionOrder {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
/*
The catch blocks are evaluated from top to bottom, and the first one that matches the exception type (or a subtype) is executed.
If catch blocks are reversed, with a more general exception caught before a specific one,
the specific catch block will never be reached.*/
