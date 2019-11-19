package com.example.sunday.sundayglide.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.example.sunday.sundayglide.request.BitmapRequest;

public class MemoryCache implements  BitmapCache{

    private LruCache<String,Bitmap> lruCache;

    private  MemoryCache(){

         int maxSize = (int)Runtime.getRuntime().freeMemory()/1024/8;
         lruCache = new LruCache<String,Bitmap>(maxSize){

             @Override
             protected int sizeOf(String key, Bitmap value) {
                 return value.getRowBytes() * value.getHeight();
             }
         };
    }

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
