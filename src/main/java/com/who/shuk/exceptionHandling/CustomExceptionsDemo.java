package com.who.shuk.exceptionHandling;

public class CustomExceptionsDemo {
    public static void main(String[] args) throws CustomException{
        if(true) throw new CustomException("custom exception is thrown");
    }
}
