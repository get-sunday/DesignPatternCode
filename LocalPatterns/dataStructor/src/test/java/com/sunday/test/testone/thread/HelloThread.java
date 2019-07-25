package com.sunday.test.testone.thread;

public class HelloThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("hello");
    }
}
