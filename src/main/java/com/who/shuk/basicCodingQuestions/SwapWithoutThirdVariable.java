package com.who.shuk.basicCodingQuestions;

import java.io.IOException;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a+b; //6+5 = 11
        b=a-b;  //11-6 = 5
        a= a-b ; //11-5=6
        System.out.println(a+" "+b);
        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));
        try {
            throw new IOException("Hello");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
