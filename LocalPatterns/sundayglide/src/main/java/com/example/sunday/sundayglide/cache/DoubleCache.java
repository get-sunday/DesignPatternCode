package com.example.sunday.sundayglide.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.example.sunday.sundayglide.request.BitmapRequest;

public class DoubleCache implements  BitmapCache {




    @Override
    public void put(BitmapRequest request, Bitmap bitmap) {

    }

    @Override
    public Bitmap get(BitmapRequest bitmapRequest) {
        return null;
    }

    @Override
    public void remove(BitmapRequest bitmapRequest) {

    }
}
