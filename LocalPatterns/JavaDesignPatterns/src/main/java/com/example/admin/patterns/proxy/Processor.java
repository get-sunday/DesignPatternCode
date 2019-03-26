package com.example.admin.patterns.proxy;

import com.example.admin.patterns.LogUtils;

public class Processor implements  IProcessor {
    @Override
    public void doMethod() {
        LogUtils.show("Processor doMethod");
    }
}
