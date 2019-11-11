package com.pony.model.singletonModel;

//懒汉模式、调用的是才加载/线程不安全的。得加synchronized
public class LazySingleton {
    private LazySingleton() {}
    private static volatile LazySingleton instance;
    //不会阻塞。。只有第一次才会有稍微的阻塞
    public static LazySingleton getInstance_1() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    //每个线程进来都需要等待前面的完成。会阻塞
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            System.out.println("创建懒汉模式");
            instance = new LazySingleton();
            instance.setName("懒汉模式");
        }
        return instance;
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
