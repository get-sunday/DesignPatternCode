package com.example.sunday.sundayglide.policy;

import com.example.sunday.sundayglide.request.BitmapRequest;

public class ReversePolicy implements LoaderPolicy {

    @Override
    public int compareto(BitmapRequest request1, BitmapRequest bitmapRequest2) {
        return  bitmapRequest2.getSerialNo() -  request1.getSerialNo();
    }
}
