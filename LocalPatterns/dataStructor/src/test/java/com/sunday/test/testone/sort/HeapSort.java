package com.sunday.test.testone.sort;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/***
 *  堆排序
 */
public class HeapSort {


    @Test
    public void test(){

        int[] arr = new int[8000000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }

        printData();

        heapSort(arr);

        printData();


//        int [] arr = {4,6,8,5,9};
//        heapSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void printData(){
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);
    }

    /**
     *
     * @param arr
     */
    public static void heapSort(int arr[] ){

        int temp = 0;

        //(1)将无序序列构造成一个大顶堆或是小顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--){
             heapTopSort(arr,i,arr.length);
        }


        /**
         * (2)将堆顶元素与末尾元素交换，将最大元素 “沉”到数组末端
         * （3）重新调整结构，使其满足堆定义，让后继续交换堆顶元素和当期那末尾元素，反复执行调整+交换步骤，直到整个序列有序、
         */
        for (int j = arr.length - 1; j > 0; j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            heapTopSort(arr,0,j);
        }


    }

    public static void heapTopSort(int arr [] ,int i,int length){
        int temp =  arr[i];
        for (int k = 2 * i +1; k < length;k = 2 * i + 1){
            if (k+1 < length  && arr[k] <  arr[k+1]) {
                k ++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }

        }
        arr[i] = temp;
    }



}
