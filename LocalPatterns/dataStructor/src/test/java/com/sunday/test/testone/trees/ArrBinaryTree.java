package com.sunday.test.testone.trees;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrBinaryTree {

    @Test
    public void test(){

    }

    public int [] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder(){
        this.preOrder(0);
    }

    public void preOrder(int index){
        if (arr == null || arr.length == 0) {
             System.out.println("数组为空，不能够进行二叉树的前序遍历!");
        }

        //输出当前这个元素
        System.out.println(arr[index]);

        if ((index * 2 + 1) < arr.length) {
            preOrder(2 * index + 1);
         }

       if ((index * 2 + 2) < arr.length) {
            preOrder(2 * index + 2);
         }



    }


}
