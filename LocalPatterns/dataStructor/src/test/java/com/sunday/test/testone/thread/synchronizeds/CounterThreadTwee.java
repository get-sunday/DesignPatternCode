package com.sunday.test.testone.thread.synchronizeds;



public class CounterThreadTwee extends Thread {

     Counter counter;


    public CounterThreadTwee(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {

        for (int  i = 0;i < 100; i++){
             counter.incr();
        }

    }
}
