package com.example.admin.patterns.factorymethodtwee;

import sun.net.sdp.SdpSupport;

public class Client {
     public static void main(String [] args){

         String data =  "ahha ";
        ExportDbOperator exportDbOperator =  new ExportDbOperator();
        exportDbOperator.export(data);


        ExportExcelOperator exportExcelOperator =  new ExportExcelOperator();
         exportExcelOperator.export(data);



     }
}
