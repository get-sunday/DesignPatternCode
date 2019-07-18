package com.sunday.test.testone.search;

import org.junit.Test;


public class test {

    @Test
    public void  test(){
         Integer [] datas = {10,20,30,40,50,60};
         System.out.println(binarySearch(datas,20));

    }

    /**
     * 二分查找算法
     * @param value
     */
    public static  int  binarySearch(Integer [] data,int value){
        int x = 1;
        int low = 0;
        int high  = data.length  -1;
        while (low <= high){
             x++;
             int  mind = (low + high)/2;
            if (value == data[mind]) {
                 System.out.println("找到数据,在" + mind+ "个位置");
                 return  mind;
            } else if (value < data[mind]) {  //去左边查找

                high = mind - 1;
            }else {
                low = mind + 1;  //去右边查找
            }
        }
        return -1;

    }
}
