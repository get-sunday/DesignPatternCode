package com.example.sunday.sundayglide.cache;

import android.graphics.Bitmap;

import com.example.sunday.sundayglide.request.BitmapRequest;

public interface BitmapCache {


    void put(BitmapRequest request, Bitmap bitmap);

    Bitmap get(BitmapRequest bitmapRequest);

    void  remove(BitmapRequest bitmapRequest);





}
