package com.sunday.test.testone.reference;

import org.junit.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 *  软: 内存不足了才回收
 *  弱：GC来了的时候会回收
 *  虚：跟中GC
 */
public class test {


    /**
     * 弱引用：
     * @throws InterruptedException
     */
    @Test
    public void tetWeakReference() throws InterruptedException {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        Object object = new Object();

        WeakReference weakReference = new WeakReference(object,referenceQueue);
        System.out.println("WeakReference: " +  weakReference.get());
        System.out.println("referenceQueue:  " + referenceQueue.poll());


        System.gc();
        Thread.sleep(2000);
        System.out.println("phantRefrence " + object);
        System.out.println("phantRefrence " + referenceQueue.poll());
    }
    //


    /**
     * 虚引用: 不会影响到程序的生命周期
     * @throws InterruptedException
     */
    @Test
    public  void  testPhantomReference() throws InterruptedException {

        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        Object object = new Object();

        object = null;

        PhantomReference phantomReference = new PhantomReference(object,referenceQueue);
        System.out.println("phantom: " +  object);
        System.out.println("phantRefrence " + referenceQueue.poll());


        System.gc();
        Thread.sleep(2000);
        System.out.println("phantRefrence " + object);
        System.out.println("phantRefrence " + referenceQueue.poll());
    }
}
