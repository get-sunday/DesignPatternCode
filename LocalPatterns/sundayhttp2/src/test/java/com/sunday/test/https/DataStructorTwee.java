package com.sunday.test.https;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Random;

public class DataStructorTwee {


    //and then so a goods friends and then then a goods friends
    @Test
    public  void test(){
        System.out.println(4>>1);
         LinkedList<MaJ> list = new LinkedList<>();
        list.add(new MaJ(3,1));
        list.add(new MaJ(2,3));
        list.add(new MaJ(3,7));
        list.add(new MaJ(1,1));
        list.add(new MaJ(3,8));
        list.add(new MaJ(2,2));
        list.add(new MaJ(3,2));
        list.add(new MaJ(1,3));
        list.add(new MaJ(3,9));
        System.out.println(list);
        radixSort(list);
        System.out.println(list);
        System.out.println(list);
        System.out.println("hello sunday");

    }

    public static void radixSorts(LinkedList<MaJ> list){ // 适用数据量在20 - 30
        //先对点数进行分组
        LinkedList[] rankList=new LinkedList[9];
        for (int i = 0; i < rankList.length; i++) {
            rankList[i]=new LinkedList();
        }
        //把数据一个个放到对应的组中
        while(list.size()>0){
            //取一个
            MaJ m=list.remove();
            //放到组中  下标=点数减1的
            rankList[m.rank-1].add(m);
        }
        //把9组合并在一起
        for (int i = 0; i < rankList.length; i++) {
            list.addAll(rankList[i]);
        }




        //先花色进行分组
        LinkedList[] suitList=new LinkedList[3];
        for (int i = 0; i < suitList.length; i++) {
            suitList[i]=new LinkedList();
        }

        //把数据一个个放到对应的组中
        while(list.size()>0){
            //取一个
            MaJ m=list.remove();
            //放到组中  下标=点数减1的
            suitList[m.suit-1].add(m);
        }
        //把3个组合到一起
        for (int i = 0; i < suitList.length; i++) {
            list.addAll(suitList[i]);
        }
    }


    public static void  radixSort(LinkedList<MaJ>  datas){ //必须要链式的 非链式对性能有影响

        LinkedList []  rankList = new  LinkedList[9];

        for (int i =0; i < rankList.length ; i++){
            rankList[i] = new LinkedList();
        }

        while (datas.size() > 0){
            MaJ m = datas.remove();
            rankList[m.rank-1].add(m);
        }
        for (int i =0; i < rankList.length; i++){
               datas.addAll(rankList[i]);
        }

        LinkedList []  ranks = new LinkedList[3];
        for (int i =0; i < ranks.length ; i++){
            ranks[i] = new LinkedList();
        }

        while (datas.size() > 0){

            MaJ remove = datas.remove();
            ranks[remove.suit-1].add(remove);
        }

        for (int i =0; i < ranks.length; i++){
            datas.addAll(ranks[i]);
        }



    }

     class MaJ{
         public int suit;
         public int rank;

         public MaJ(int suit, int rank) {
             this.suit = suit;
             this.rank = rank;
         }


         @Override
         public String toString() {
             return "MaJ{" +
                     "suit=" + suit +
                     ", rank=" + rank +
                     '}';
         }
     }
}
