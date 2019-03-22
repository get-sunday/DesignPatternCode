package com.example.admin.patterns.factorymethod;

public abstract class  Creator {

    protected abstract  Product  factorMethod();
    //第二种方式直接传入class获得对象。
    public  abstract <T extends AbstractExport> T newFileApis(Class<T> clz);

    /**
     * 示意会使用产品的某些功能
     */
    public void someOperation(){
         Product p = factorMethod();
         //使用产品
    }
}
