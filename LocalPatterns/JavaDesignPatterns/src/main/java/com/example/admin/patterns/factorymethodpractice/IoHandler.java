package com.example.admin.patterns.factorymethodpractice;

public abstract class IoHandler {

     abstract void add(String id,String name);
     abstract void remove(String id);
     abstract void update(String id,String name);
     abstract void query(String id);

}
