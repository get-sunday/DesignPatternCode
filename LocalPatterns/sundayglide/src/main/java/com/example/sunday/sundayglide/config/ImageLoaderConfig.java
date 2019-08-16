package com.example.sunday.sundayglide.config;

import com.example.sunday.sundayglide.cache.BitmapCache;
import com.example.sunday.sundayglide.policy.LoaderPolicy;

public class ImageLoaderConfig {

     private BitmapCache bitmapCache;

     private LoaderPolicy loaderPolicy;


     private  int  defaultThradCount  = Runtime.getRuntime().availableProcessors();

     private  DisplayConfig displayConfig;


     //建造者模式
     private ImageLoaderConfig(){

     }

     public LoaderPolicy getPolicy(){
         return loaderPolicy;
     }

     public static  class  Builder{

         private  ImageLoaderConfig  config;

         public Builder(){

              config = new ImageLoaderConfig();
         }

         public Builder setCachePolicy(LoaderPolicy loaderPolicy){

              config.loaderPolicy = loaderPolicy;

             return this;
         }

         public Builder setThreadCount(int threadCount){
              config.defaultThradCount = threadCount;
               return this;
         }

         public Builder setLoadingImage(int image){
               config.displayConfig.loadingImage =  image;

                return this;
         }

         public Builder setFailIamge(int image){
               config.displayConfig.loadFailImage =  image;

                return this;
         }


         public  ImageLoaderConfig build(){
             return  config;
         }





     }
}
