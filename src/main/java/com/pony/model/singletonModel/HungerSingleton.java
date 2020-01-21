package com.pony.model.singletonModel;

//一加载就实例化
public class HungerSingleton {

    private static HungerSingleton singleton=new HungerSingleton();
    private String name;
    private HungerSingleton() {
        System.out.println("创建饿汉模式");
    }
    public static HungerSingleton getInstance(){
        singleton.setName("饿汉模式");
        return singleton;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
