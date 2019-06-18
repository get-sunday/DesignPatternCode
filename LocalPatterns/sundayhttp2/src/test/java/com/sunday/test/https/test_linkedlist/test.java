package com.sunday.test.https.test_linkedlist;

import com.sunday.test.https.datastructor.SundayLink;

import org.junit.Test;

public class test {


    @Test
    public void test(){

        SundayLink<Integer> link = new SundayLink<>();
        link.add(1);
        link.add(2);
        link.add(3);

        link.add(0,5);

        for (int i =0;i < link.size; i++){
            System.out.print("i= " + link.get(i));
        }
    }
}
