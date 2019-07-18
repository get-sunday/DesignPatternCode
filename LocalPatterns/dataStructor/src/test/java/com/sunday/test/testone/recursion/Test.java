package com.sunday.test.testone.recursion;

/**
 *  递归测试
 */
public class Test {


    @org.junit.Test
    public void  recursion(){
//         prints(3);
//         System.out.println(jiechen(5));
//         System.out.println(fibonaccsiSequence(5));
         hanluo(3,1,2,3);
    }


    /**
     * 调用规则：
     * 1.每当程序执行一个方法时，就会开辟一个独立的空间（栈）
     * 2.每个空间的数据（局部变量),都是独立的.
     * @param n
     */
    public static void prints(int n){
        System.out.println("a=" +n);
        if (n <  0) {
           return;
        }else {
             prints(n-1);
             System.out.println("b="+n);
        }
    }

    /**
     *
     */
    public static int  jiechen(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * jiechen(n - 1);
        }
     }

   public  int fibonaccsiSequence(int n) {
       if (n == 1 || n == 2) {
           return 1;
       } else {
           return fibonaccsiSequence(n - 1) + fibonaccsiSequence(n - 2);
       }
    }

    /***
     *
     * @param n  盘子的个数
     * @param start 开始的柱子
     * @param middle 中介柱子
     * @param end  结果柱子
     */
    public static void  hanluo(int n, int start,int middles,int end){
        if (n <=1 ) {
             System.out.println(start + "---->" +end);
        }else {
             hanluo(n-1,start,end,middles);
             System.out.println(start + "---->" +end);
            hanluo(n-1,middles,start,end);
        }
    }


}
