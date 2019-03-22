package com.example.admin.patterns.factorymethod;

import com.example.admin.patterns.factorymethodtwee.ExportDbOperator;
import com.example.admin.patterns.factorymethodtwee.ExportExcelOperator;

public class Client {
     public static void main(String [] args){

         Creator  export = new ConcreteCreator();
//         ConcreteProduct concreteProduct = export.newFileApis(ConcreteProduct.class);


     }
}
