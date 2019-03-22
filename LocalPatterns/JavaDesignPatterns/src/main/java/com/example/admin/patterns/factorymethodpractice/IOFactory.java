package com.example.admin.patterns.factorymethodpractice;

public class IOFactory {

    /**
     * 获取 IO 处理者
     * @param clz
     * @param <T>
     * @return
     */
    public static <T extends  IoHandler> T getIoHandler(Class<T> clz){
        IoHandler handler = null;
        try {
            handler = (IoHandler)Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) handler;
    }
}
