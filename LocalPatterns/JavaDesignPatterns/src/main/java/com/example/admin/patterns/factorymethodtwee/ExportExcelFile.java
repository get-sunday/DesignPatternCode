package com.example.admin.patterns.factorymethodtwee;

import com.example.admin.patterns.LogUtils;

public class ExportExcelFile implements ExportFileApi {

    @Override
    public void export(String data) {
        LogUtils.show("导出数据到文本文件。。。。");
    }
}
