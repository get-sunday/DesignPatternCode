package com.sunday.test.testone.thread.synchronizeds;

public class CounterThread extends Thread {

      public static int  counter = 0;

    @Override
    public void run() {

        for (int  i = 0;i < 100; i++){
             counter ++;
        }

    }
}
