package com.example.admin.patterns.factorys;

public class Factory {

    public static API createA(int type) {
        if (type == 1) {
            return new IApiA();
        } else if (type == 2) {
            return new IApiB();
        }else {
            throw  new RuntimeException("the type is not solid");
        }

    }
}
