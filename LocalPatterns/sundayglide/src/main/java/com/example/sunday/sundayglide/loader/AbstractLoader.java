package com.example.sunday.sundayglide.loader;

import com.example.sunday.sundayglide.cache.BitmapCache;
import com.example.sunday.sundayglide.policy.LoaderPolicy;
import com.example.sunday.sundayglide.request.BitmapRequest;

public abstract  class AbstractLoader implements Loader {

    private LoaderPolicy loaderPolicy;

    private BitmapCache cache;



    @Override
    public void loadImage(BitmapRequest request) {

    }

    private  boolean  hasLoadingPlaceHolder(){

        return false;

    }


}
