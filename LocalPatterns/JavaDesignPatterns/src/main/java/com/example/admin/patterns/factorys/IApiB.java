package com.example.admin.patterns.factorys;

import com.example.admin.patterns.LogUtils;

public class IApiB implements API {
    @Override
    public void operation() {
//            System.out.print("operation A");
        LogUtils.show("operation B");

    }
}
