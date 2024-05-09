package com.who.shuk.miscellaneous;

import com.who.shuk.exceptionHandling.CustomException;

import java.util.Date;

public final class CustomImmutableClass {

    private final int field1;
    private final String field2;


    public CustomImmutableClass(int field1, String field2, Date date) {
        this.field1 = field1;
        this.field2 = field2;
        this.date = date;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    /*Date is a mutable class thus we are modifying the getter method to return the clone rather than reference */
    public Date getDate() {
        return (Date) date.clone();
    }

    private final Date date;

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", date=" + date +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        //CustomImmutableClass customImmutableClass = new CustomImmutableClass(1,"field2");
        //customImmutableClass.field2="field2updated"; -- this line throws error as we can't change immutable class
        CustomImmutableClass customImmutableClass = new CustomImmutableClass(1, "field2", new Date());
        System.out.println(customImmutableClass);
        customImmutableClass.getDate().setDate(15);
        System.out.println(customImmutableClass);

    }
}

