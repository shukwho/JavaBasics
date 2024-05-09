package com.who.shuk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();//FailFast
        List<String> list2 = new CopyOnWriteArrayList<>();//FailSafe

        list1.add("a"); list1.add("b");
        list2.add("d"); list2.add("e");
        Iterator<String> itr1 = list1.iterator();
        Iterator<String> itr2 = list2.iterator();

        while (itr1.hasNext()){
            String element = itr1.next();
            System.out.println(element);
           // list1.add("c");
        }
        while (itr2.hasNext()){
            String element = itr2.next();
            System.out.println(element);
            list1.add("f");
        }


    }

}
