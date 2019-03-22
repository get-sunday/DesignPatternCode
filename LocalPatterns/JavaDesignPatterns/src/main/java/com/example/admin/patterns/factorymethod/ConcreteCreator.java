package com.example.admin.patterns.factorymethod;

public class ConcreteCreator extends   Creator{

    @Override
    protected Product factorMethod() {
        return null;
    }

    @Override
    public <T extends AbstractExport> T newFileApis(Class<T> clz) {
        AbstractExport export = null;
        try {
            export = (AbstractExport)Class.forName(clz.getName()).newInstance();
        }catch (Exception e){

        }
        return (T)export;
    }
}
