package com.who.shuk.miscellaneous;

public class StaticAndInstanceInitializer {


    static int staticVariable =5;
    int instanceVariable =4;

    static{
        System.out.println("This is static initializer block");
        System.out.println(staticVariable);
       /* This is static initializer block
        5*/
    }
    {
        System.out.println("This is Instance initializer block");
        System.out.println(instanceVariable);
        /*This is Instance initializer block
        4
        This is Instance initializer block
        4
        This is Instance initializer block
        4*/
    }
    public static void main(String[] args) {

        StaticAndInstanceInitializer s1= new StaticAndInstanceInitializer();
        StaticAndInstanceInitializer s2= new StaticAndInstanceInitializer();
        StaticAndInstanceInitializer s3= new StaticAndInstanceInitializer();

    }
}
