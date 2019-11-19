package com.example.sunday.sundayglide.policy;

import com.example.sunday.sundayglide.request.BitmapRequest;

public class SeriaPolicy implements LoaderPolicy {


    @Override
    public int compareto(BitmapRequest request1, BitmapRequest bitmapRequest2) {
        return request1.getSerialNo() - bitmapRequest2.getSerialNo();
    }
}
