package com.sunday.test.testone.thread.wait;

import java.lang.reflect.WildcardType;

public class WaitThread extends Thread {

    public  volatile  boolean fire = false;


    @Override
    public void run() {

        synchronized (this){
            while (!fire) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  synchronized  void fire(){
        this.fire = true;
         notify();
    }
}
