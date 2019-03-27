package com.example.admin.patterns.utilsss;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.util.ArrayList;

/**
 *  设计一个可复用的工具类
 *
 */
public class Validator {

    private final ArrayList<Item> list;

    public interface   IValidater{
          boolean verify(String content,String tip);
     }
    public interface  ValicatorCallBack{
        void onSuccess();
        void onFail(String msg);
     }

     public class Item{
         public String content;
         public String tip;
         public IValidater iValidater;

         public Item(String content,String tips,IValidater iValidater){
              this.content = content;
              this.tip = tips;
              this.iValidater = iValidater;
         }
     }


     public Validator(){
          list = new ArrayList<>();
     }

     public  Validator add(String content,String tips,IValidater validater){
        list.add(new Item(content,tips,validater));
        return this;
    }

    public void verify(ValicatorCallBack callBack){
        for (Item item: list){
            if (item.iValidater.verify(item.content,item.tip)) {
                 callBack.onSuccess();
            }else {
                  callBack.onFail(item.tip);
            }
        }
    }




}
