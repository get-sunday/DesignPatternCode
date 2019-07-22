package com.sunday.test.testone.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Level;

public class BubbleSort {


    @Test
    public void test(){

        //冒泡排序的速度O（n^2)，给800000个数据测试
        int [] arr = {3,9,-1,10,20};
        int [] datas = new int[80000];

        Utis.printData();

        for (int i = 0; i < 80000; i++){
            datas[i] = (int)(Math.random() * 80000);
        }

        optimizeV(datas);

        Utis.printData();
        System.out.println(Arrays.toString(arr));
    }


    static void optimizeV(int [] datas){
         int temp = 0;
         boolean flag = false;
        for (int i = 0; i < datas.length; i++){
            for (int j = 0; j < datas.length - i - 1; j++) {
                //如果前面的数比后面的大，则交换
                if (datas[j] > datas[j + 1]) {
                     flag = true;
                    temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }

            if (!flag) {
                 break;
            }else {
                flag = false;
            }
        }
    }

    public static void  bobbleSort(int [] datas){

        int temp = 0;

        for (int i= 0; i < datas.length; i++ )

            for (int j = 0; j < datas.length - i - 1; j++) {
                //如果前面的数比后面的大，则交换
                if (datas[j] > datas[j + 1]) {
                    temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }

                System.out.println("第几次"+(i+1)+"排序");
                System.out.println(Arrays.toString(datas));
            }
        System.out.println(Arrays.toString(datas));

    }
}
