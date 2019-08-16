package com.example.sunday.sundayglide.loader;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.example.sunday.sundayglide.config.DisplayConfig;
import com.example.sunday.sundayglide.config.ImageLoaderConfig;
import com.example.sunday.sundayglide.request.RequestQueue;

import java.util.AbstractMap;
import java.util.Dictionary;

public class SimpleImageLoader {

     private    ImageLoaderConfig config;

     private RequestQueue queue;

     public  static volatile  SimpleImageLoader simpleImageLoader;

     private  SimpleImageLoader(ImageLoaderConfig config){
         this.config  = config;

     }

     private  SimpleImageLoader(){

     }


     public static SimpleImageLoader   getInstance(ImageLoaderConfig config){
         if (simpleImageLoader == null) {
             synchronized (SimpleImageLoader.class){
                 if (simpleImageLoader == null) {
                       simpleImageLoader = new SimpleImageLoader(config);
                 }
             }
         }
         return simpleImageLoader;
     }

     public static SimpleImageLoader getInstance(){
         if (simpleImageLoader  == null) {
               throw new NullPointerException("simplelLoader policy is null, please checked it again");
         }
         return  simpleImageLoader;
     }

     public   ImageLoaderConfig getConfig(){
         return config;
     }

     public  void  displayImage(ImageView imageView, String url ){
            displayImage(imageView,url,null,null);

     }

     public  void  displayImage(ImageView imageView, String url , DisplayConfig config){
         displayImage(imageView,url,config,null);
     }

     public  void  displayImage(ImageView imageView, String url ,
                                DisplayConfig config,
                                ImageListener imageListener){


     }



     public static interface ImageListener{

          void  complete(ImageView imageView, Bitmap  bitmap,String url);
     }


}
