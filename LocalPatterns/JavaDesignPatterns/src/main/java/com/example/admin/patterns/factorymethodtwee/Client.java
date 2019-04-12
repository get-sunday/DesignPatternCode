package com.example.admin.patterns.factorymethodtwee;


public class Client {
     public static void main(String [] args){

         String data =  "ahha ";
        ExportDbOperator exportDbOperator =  new ExportDbOperator();
        exportDbOperator.export(data);


        ExportExcelOperator exportExcelOperator =  new ExportExcelOperator();
         exportExcelOperator.export(data);



     }
}
