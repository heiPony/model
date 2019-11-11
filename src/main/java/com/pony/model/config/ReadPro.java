package com.pony.model.config;

import java.util.ResourceBundle;

public class ReadPro {
    enum Color {red, blue, green}

    public static void main(String[] args) {
        for (Color item : Color.values()) {
            System.out.println(item+"---"+item.ordinal());
        }


    }

    public static void readPro() {
        ResourceBundle rb = ResourceBundle.getBundle("pro");
        String className = rb.getString("className");
        System.out.println(className);
    }


}
