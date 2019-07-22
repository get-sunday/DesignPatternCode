package com.sunday.test.testone.sort;

public class SelectSort {


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

