package com.who.shuk.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Showing implementation of Comparable interface*/
public class Student implements Comparable<Student>{
    private int id;
    private String name;

      public Student(int id, String name) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override //sorting based on the ids
    public int compareTo(Student s) {
       if(id == s.id) return 0;
       else if(id>s.id) return 1;
       else return -1;
    }
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        Student student3=new Student(3,"student3");
        Student student1=new Student(1,"student1");
        Student student2=new Student(2,"student2");

        listOfStudents.add(student3);
        listOfStudents.add(student1);
        listOfStudents.add(student2);

        Collections.sort(listOfStudents);
        System.out.println(listOfStudents);
    }
}
