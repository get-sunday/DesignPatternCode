package com.example.admin.patterns.factorys;


public class homes {

     public static void main(String [] args){
         System.out.print("hello");

        API a  =  Factory.createA(1);
        API b  =  Factory.createA(2);
        a.operation();
        b.operation();
     }
}
