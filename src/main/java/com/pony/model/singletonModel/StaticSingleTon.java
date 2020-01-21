package com.pony.model.singletonModel;

import org.springframework.stereotype.Component;

@Component
public class StaticSingleTon {

    private String name;
    private StaticSingleTon(){
    }
    private static class SingletonHelp{
        static StaticSingleTon instance  = new StaticSingleTon();
    }

    public static StaticSingleTon getInstance(){
        return StaticSingleTon.SingletonHelp.instance;
    }

    public void getDesc(){
        System.out.println("这是静态内部类方法:"+this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}