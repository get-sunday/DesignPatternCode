package com.sunday.test.https.test_stack;

import org.junit.Test;

public class test {




    @Test
    public void test(){

        print(3);
    }

    public void print(int a){
        System.out.println(a);
        if (a < 0) {
            return;
        }else {
            print(a-1);
            System.out.println(a);
        }
    }

    /**
     *
     */
    public void fibonacciSequence(int a){


    }
}
