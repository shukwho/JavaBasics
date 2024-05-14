package com.who.shuk.multithreading;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Calculator thread = new Calculator();
        thread.start();
        synchronized (thread){
            try{
                thread.wait();
            }catch(InterruptedException interruptedException){
                interruptedException.printStackTrace();

            }
      }

        System.out.println(thread.sum);
    }
}
class Calculator extends Thread{

    long sum;
    public void run(){
        synchronized (this){
            for(int i=0;i<1000;i++){
                sum=sum+i;
            }
            notify();
        }
    }


}
