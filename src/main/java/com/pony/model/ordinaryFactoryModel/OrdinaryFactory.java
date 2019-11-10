package com.pony.model.ordinaryFactoryModel;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//简单工厂模式(静态工厂方法模式)定义一个类创建其他类，被创建的实例通常都有共同的父类
public class OrdinaryFactory {
        public static FruitStore get(String name){
            try {
                Properties pro = new Properties();
                ClassLoader classLoader = OrdinaryFactory.class.getClassLoader();
                InputStream is = classLoader.getResourceAsStream("pro.properties");
                pro.load(is);
                String className = pro.getProperty("className");
                Class fruit = Class.forName(className+"."+name);
                Method getFruit = fruit.getMethod("getFruit");
                return  (FruitStore) fruit.newInstance();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

    public static void main(String[] args) {
        FruitStore apple = OrdinaryFactory.get("Apple");
        FruitStore banana = OrdinaryFactory.get("Banana");
        apple.getFruit();
        banana.getFruit();
    }
}

