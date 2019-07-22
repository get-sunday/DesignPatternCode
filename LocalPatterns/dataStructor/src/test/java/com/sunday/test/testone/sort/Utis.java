package com.sunday.test.testone.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utis {

    public static void printData(){
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);
    }
}
