package com.example.admin.patterns.factorymethodtwee;

import com.example.admin.patterns.LogUtils;

public class ExportDbFile implements ExportFileApi {

    @Override
    public void export(String data) {
        LogUtils.show("导出数据到数据库文件。。。。");
    }
}
