package com.pony.model.ordinaryFactoryModel;

public class Apple implements FruitStore{
    @Override
    public void getFruit() {
        System.out.println("sell apple");
    }
}
