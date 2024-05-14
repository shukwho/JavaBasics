package com.who.shuk.miscellaneous;

public class SingletonClass {
    private static SingletonClass singletonClasInstance=null;
    private SingletonClass(){
    }
    public static SingletonClass getInstance(){
        if(singletonClasInstance ==null){
            singletonClasInstance = new SingletonClass();
        }
        return singletonClasInstance;
    }
}

class TestSingleton{
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s1.hashCode()+" "+s2.hashCode());
    }
}
