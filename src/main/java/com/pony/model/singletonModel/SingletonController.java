package com.pony.model.singletonModel;

//私有构造器、自行实例化、全局访问点
public class SingletonController {
    public static void main(String[] args) {
        hungerSingleton();
    }



    private static void hungerSingleton() {
        HungerSingleton instance = HungerSingleton.getInstance();
        HungerSingleton singleton = HungerSingleton.getInstance();
        instance.setName("单例恶汉模式一");
        singleton.setName("单例恶汉模式二");
        System.out.println(instance.getName());
        System.out.println(singleton.getName());
    }

    private static void lazySingleton() {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton singleton = LazySingleton.getInstance();
        instance.setName("单例懒汉模式一");
        singleton.setName("单例懒汉模式二");
        System.out.println(instance.getName());
        System.out.println(singleton.getName());
    }

    private static void staticSingleton(){
        StaticSingleTon instance = StaticSingleTon.getInstance();
        StaticSingleTon instance2 = StaticSingleTon.getInstance();
        instance.setName("静态内部类1");
        instance2.setName("静态内部类2");
        instance.getDesc();
        instance2.getDesc();
    }
}
