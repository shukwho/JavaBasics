package com.who.shuk.basics;

public class EqualsDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(2);
        Employee e3=e1;

        System.out.println(e1==e2); //false
        System.out.println(e1==e3); //true
        System.out.println(e1.equals(e2)); //false
        System.out.println(e1.equals(e3)); //true

    }
}
class Employee{
    private int id;
    public Employee(int id){
        this.id = id;
    }
}
