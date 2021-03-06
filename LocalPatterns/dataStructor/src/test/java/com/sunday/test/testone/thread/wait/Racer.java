package com.sunday.test.testone.thread.wait;

public class Racer extends Thread {

    FireFlag fireFlag;

    public Racer(FireFlag fireFlag){
        this.fireFlag = fireFlag;
    }


    @Override
    public void run() {

        try {
            this.fireFlag.waitForFire();
            System.out.println("Start run "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
