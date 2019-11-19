package com.example.sunday.sundayglide.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;

import com.example.sunday.sundayglide.disk.DiskLruCache;
import com.example.sunday.sundayglide.request.BitmapRequest;

import java.io.File;
import java.io.IOException;

public class DiskCache implements  BitmapCache{

    private static DiskCache  mDiskCache;

    private  String mCacheDir = "Image";

    private static final  int MB = 1024 * 1024;

    private DiskLruCache diskLruCache;

    private  DiskCache(Context context){
         initDiskCache(context);
    }

    public static DiskCache  getInstance(Context context){
        if (mDiskCache == null) {
             synchronized (DiskCache.class){
                 if (mDiskCache == null) {
                       mDiskCache  = new DiskCache(context);
                 }
             }
        }
        return mDiskCache;
    }

    private void initDiskCache(Context context) {
        //得到缓存目录
        File  directory = getDiskCache(mCacheDir,context);
        if (!directory.exists()) {
              directory.mkdir();
        }

        try {
            diskLruCache =  DiskLruCache.open(directory,1,1,50 * MB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getDiskCache(String mCacheDir, Context context) {
         return  new File(Environment.getExternalStorageDirectory(),mCacheDir);
    }


    @Override
    public void put(BitmapRequest request, Bitmap bitmap) {

        DiskLruCache.Editor editor = null;


    }

    @Override
    public Bitmap get(BitmapRequest bitmapRequest) {
        return null;

    }

    @Override
    public void remove(BitmapRequest bitmapRequest) {

    }
}
