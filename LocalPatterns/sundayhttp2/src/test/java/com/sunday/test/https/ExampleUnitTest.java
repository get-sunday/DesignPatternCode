package com.sunday.test.https;

import org.junit.Test;

import java.security.Key;
import java.util.TreeMap;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void testSwap() {
//        System.out.print("1 hellos ");
//        System.out.print("1 hellos ");
        int [] datas = {1,3,5,2,8,9};
//        bubbleSort(datas);
        selectSort(datas);
    }


    /**
     * 核心思想 就是 从第二个下标开始 每次循环得到最小值 与当前一位进行替换
     *  3 4  6 8 9 2
     *  2 4 6 8 9 3
     *  2 3 6894
     *  2 3 4 8 9 6
     *  2 3 4 6 8 9
     *  2 3 4 6 8 9
     * @param datas
     */
    public static void selectSort(int [] datas){


        for (int  j = 0;j < datas.length - 1; j++) {
            int index = j;
            for (int i = j+1; i < datas.length; i++) {
                if (datas[i] < datas[index]) {
                    index = i;
                }
            }
            //The value is dont't eqia,then change the values.
            if (index != j) {
                int temp = datas[index];
                datas[index] = datas[j];
                datas[j] = temp;
            }
        }
        for (int i: datas){
            System.out.print(i + "\t");
        }
    }

    public static void  bubbleSort(int [] datas){

        //冒泡排序
         for (int  i= datas.length -1; i > 0; i--){
             boolean  flag = true; //减少时间复杂度   适用于数据量较少 < 5
             for (int  j = 0; j < i; j++){
                 if (datas[j] > datas[j+1]) {
                       int temp =  datas[j];
                       datas[j] = datas[j+1];
                       datas[j+1] = temp;
                 }
                flag = false;
             }
             if (flag) {
                 break;
             }
         }
         for (int i: datas){
            System.out.print(i + "\n");
         }

    }


}