package com.example.sunday.sundayglide.request;

import com.example.sunday.sundayglide.loader.SimpleImageLoader;
import com.example.sunday.sundayglide.policy.LoaderPolicy;

import java.util.Comparator;

public class BitmapRequest implements Comparator<BitmapRequest> {

    private LoaderPolicy policy  = SimpleImageLoader.getInstance().getConfig().getPolicy();


    @Override
    public int compare(BitmapRequest o1, BitmapRequest o2) {
        return 0;
    }

//    private LoaderPolicy
}
