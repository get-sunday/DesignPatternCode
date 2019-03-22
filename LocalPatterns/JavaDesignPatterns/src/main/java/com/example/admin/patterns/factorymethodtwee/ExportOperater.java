package com.example.admin.patterns.factorymethodtwee;

public abstract class ExportOperater {

      public abstract  ExportFileApi  newFileApi();

    /**
     *
     * @param data
     */
      public void export(String data){
           ExportFileApi api =  newFileApi();
           api.export(data);
      }

    
}
