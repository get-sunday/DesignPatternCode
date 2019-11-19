package com.example.sunday.sundayglide.request;

import java.util.concurrent.BlockingQueue;

public class RequestfDispatcher extends  Thread {

    private final BlockingQueue queue;

    public RequestfDispatcher(BlockingQueue queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        super.run();

    }

    //Sunday
    private  boolean  parseScheme(String url){

        return  false;
    }
}
