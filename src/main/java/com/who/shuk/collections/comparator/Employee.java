package com.who.shuk.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1,"ashish");
        Employee e3 = new Employee(3,"bhavna");
        Employee e2 = new Employee(2,"priyanka");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Collections.sort(list,new NameComparator());
        System.out.println(list);
        Collections.sort(list,new IdComparator());
        System.out.println(list);





    }
}
