package com.example.admin.patterns.factorymethodtwee;

public class ExportExcelOperator extends  ExportOperater{
    @Override
    public ExportFileApi newFileApi() {
        return new ExportTxtFile();
    }
}
