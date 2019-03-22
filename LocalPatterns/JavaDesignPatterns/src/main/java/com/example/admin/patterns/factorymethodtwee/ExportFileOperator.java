package com.example.admin.patterns.factorymethodtwee;

public class ExportFileOperator  extends  ExportOperater{
    @Override
    public ExportFileApi newFileApi() {
        return new ExportTxtFile();
    }
}
