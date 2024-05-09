package com.who.shuk.miscellaneous;

public class MutableClass {


    private String mutableClassField1;
    private String mutableClassField2;


    public MutableClass(String mutableClassField1, String mutableClassField2) {
        this.mutableClassField1 = mutableClassField1;
        this.mutableClassField2 = mutableClassField2;
    }

    public String getMutableClassField1() {
        return mutableClassField1;
    }

    public String getMutableClassField2() {
        return mutableClassField2;
    }

    public void setMutableClassField1(String mutableClassField1) {
        this.mutableClassField1 = mutableClassField1;
    }

    public void setMutableClassField2(String mutableClassField2) {
        this.mutableClassField2 = mutableClassField2;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "mutableClassField1='" + mutableClassField1 + '\'' +
                ", mutableClassField2='" + mutableClassField2 + '\'' +
                '}';
    }
}
