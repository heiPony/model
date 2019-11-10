package com.pony.model.ordinaryFactoryModel;

public class Test {
    public static void main(String[] args) {
        try {
            Class<?> apple = Class.forName("com.pony.model.ordinaryFactoryModel.Apple");
            System.out.println(apple.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
