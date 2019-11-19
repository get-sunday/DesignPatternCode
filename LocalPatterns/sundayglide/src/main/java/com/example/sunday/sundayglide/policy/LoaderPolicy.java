package com.example.sunday.sundayglide.policy;

import com.example.sunday.sundayglide.request.BitmapRequest;

public interface LoaderPolicy {

    int compareto(BitmapRequest request1, BitmapRequest bitmapRequest2);

}
