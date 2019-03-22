package com.example.admin.patterns.factorymethodtwee;

public class ExportDbOperator extends  ExportOperater{
    @Override
    public ExportFileApi newFileApi() {
        return new ExportDbFile();
    }
}
