package com.sunday.test.testone.thread.wait;

import java.util.TreeMap;

/**
 *  同时开始
 *  类似于运动员听到枪声后，同时开始
 *  fired 表示这个写作对象
 *  子线程调用waitForFire 等待枪响
 *  主线程调用fire() 发射比赛时候的信号
 */
public class FireFlag  {

    private volatile boolean  fired = false;
    public synchronized void waitForFire() throws InterruptedException {
        while (!fired) {
             wait();
        }
    }

    public  synchronized  void fire(){
        this.fired = true;
         notifyAll();
    }
}
