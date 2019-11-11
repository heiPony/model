package com.pony.model.config;

import java.util.ResourceBundle;

public class ReadPro {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("pro");
        String className = rb.getString("className");
        System.out.println(className);
    }


}
