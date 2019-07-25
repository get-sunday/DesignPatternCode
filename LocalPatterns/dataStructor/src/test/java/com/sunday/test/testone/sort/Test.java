package com.sunday.test.testone.sort;


import java.util.Arrays;

public class Test {

     @org.junit.Test
     public void test(){
          int [] arr = {-1,2,5,-3};
          bobbleSort(arr);
          System.out.println(Arrays.toString(arr));
     }



     private static void bobbleSort(int [] arr){
         int temp = 0;
         for (int i = 0; i < arr.length; i++){
             for (int j = 0; j < arr.length - i -1; j++){
                 if (arr[j] > arr[j+1]) {
                      temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                 }
             }
         }
     }
     private static void selectSort(int [] arr){
         int temp = 0;

         for (int i = 0; i < arr.length; i++){

             for (int j = 0; j < arr.length - i -1; j++){
                 if (arr[j] > arr[j+1]) {
                      temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                 }
             }
         }
     }


}
