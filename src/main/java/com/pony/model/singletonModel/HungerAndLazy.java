package com.pony.model.singletonModel;

public class HungerAndLazy {

    private  static HungerAndLazy instance;
    private String name;

    private HungerAndLazy(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
