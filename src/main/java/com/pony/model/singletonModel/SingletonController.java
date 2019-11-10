package com.pony.model.singletonModel;

//私有构造器、自行实例化、全局访问点
public class SingletonController {
    public static void main(String[] args) {
        lazySingleton();
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
}
