package com.sunday.study.one.leaks;

import android.util.Printer;
import android.util.SparseArray;

import javax.net.ssl.SSLParameters;

public class ObjectPool<T> {

    private SparseArray<T>  freePool;
    private SparseArray<T>  lentPool;

    private int maxCapacity;



    public ObjectPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    //日志的方式的啦！
    //啊哈哈  大侠魅力无限
}
