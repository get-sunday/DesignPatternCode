package com.sunday.test.testone.thread.wait;

public class Consumer extends Thread {


    MyBlockingQueue<String> queue;
    Consumer(MyBlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        int num = 0;
        try {
            while (true) {
                String take = queue.take();
                System.out.println("hanle task" + take);
                Thread.sleep((int)Math.random() * 100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
