package com.pony.model.ordinaryFactoryModel;

//简单工厂模式(静态工厂方法模式)定义一个类创建其他类，被创建的实例通常都有共同的父类
public class OrdinaryFactory {
        public static FruitStore get(String name){

            try {
                Class fruit = Class.forName(name);
                return  (FruitStore) fruit.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }

    public static void main(String[] args) {
        FruitStore fruitStore = OrdinaryFactory.get("com.pony.model.ordinaryFactoryModel.Apple");
        fruitStore.getFruit();
    }
}

