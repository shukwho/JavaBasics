package com.who.shuk.multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        /*Demo of extending thread
        MyThreadOne t1 = new MyThreadOne();
       t1.start();
        for(int i=0;i<100000;i++){
            System.out.println("Main thread");
        }
        /*Demo of implementing Runnable

        MyThreadTwo t2 = new MyThreadTwo();
        Thread t = new Thread(t2);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }

         */
    }
}
class MyThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Child thread");
        }
    }
}
class MyThreadTwo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread======");
        }

    }
}
