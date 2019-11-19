package com.example.sunday.sundayglide.request;

import android.widget.ImageView;

import com.example.sunday.sundayglide.config.DisplayConfig;
import com.example.sunday.sundayglide.core.SimpleImageLoader;
import com.example.sunday.sundayglide.loader.Loader;
import com.example.sunday.sundayglide.policy.LoaderPolicy;
import com.example.sunday.sundayglide.utils.MD5Utils;

import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.List;


public class BitmapRequest implements Comparator<BitmapRequest> {


    private SoftReference<ImageView> imageViewSoft;

    private String imageUrl;

    private String  imageUriMD5;

    private  SimpleImageLoader.ImageListener listener;

    private DisplayConfig displayConfig;


    private LoaderPolicy policy  = SimpleImageLoader.getInstance().getConfig().getPolicy();

    private int serialNo;

    public  BitmapRequest(ImageView imageView,String imageUrl, DisplayConfig displayConfig,
                          SimpleImageLoader.ImageListener imageListener){

        this.imageViewSoft = new SoftReference<>(imageView);
        imageView.setTag(imageUrl);
        this.imageUrl = imageUrl;
        this.imageUriMD5 = MD5Utils.toMD5(imageUrl);
        if (displayConfig != null) {
             this.displayConfig = displayConfig;

        }
        this.listener = imageListener;

    }


    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }


    @Override
    public boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return  false;

        BitmapRequest request = (BitmapRequest)o;
        if (serialNo != request.getSerialNo()) return  false;

        return policy != null ? policy.equals(request.policy) : request.policy == null;

    }

    @Override
    public int compare(BitmapRequest o1, BitmapRequest o2) {
        return policy.compareto(o1,o2);
    }



}

