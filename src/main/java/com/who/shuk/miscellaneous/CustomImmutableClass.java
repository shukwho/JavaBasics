package com.who.shuk.miscellaneous;

import com.who.shuk.exceptionHandling.CustomException;

public final class CustomImmutableClass {

    private final int field1;
    private final String field2;

    public CustomImmutableClass(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public static void main(String[] args) {
        CustomImmutableClass customImmutableClass = new CustomImmutableClass(1,"field2");
        //customImmutableClass.field2="field2updated"; -- this line throws error as we can't change immutable class
    }
}
