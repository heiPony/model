package com.pony.model.ordinaryFactoryModel;

public class Banana implements FruitStore {
    @Override
    public void getFruit() {
        System.out.println("sell banana");
    }
}
