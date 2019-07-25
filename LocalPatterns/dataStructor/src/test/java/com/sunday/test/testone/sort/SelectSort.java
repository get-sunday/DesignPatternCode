package com.sunday.test.testone.sort;

import org.junit.Test;

import java.util.Arrays;

public class SelectSort {

    @Test
    public void test(){

        //冒泡排序的速度O（n^2)，给800000个数据测试 //3s
        int [] arr = {3,9,-1,10,20};
        int [] datas = new int[80000];

        Utis.printData();

        for (int i = 0; i < 80000; i++){
            datas[i] = (int)(Math.random() * 80000);
        }

        seletSort(datas);

        Utis.printData();
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 选择排序
     *
     * @param arr
     */
    public static void seletSort(int [] arr){

        int minIndex = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }


    }

}

