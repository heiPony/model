package com.pony.model.enumTest;

public class EnumDemo {
    enum Color {red, blue, green,black}

    public static void main(String[] args) {
        for (Color item : Color.values()) {
            System.out.println(item+"---"+item.ordinal());
        }
        Color blue=Color.blue;
        System.out.println(blue.name());
        System.out.println(blue.ordinal());
        System.out.println(blue.getDeclaringClass());
        System.out.println(blue.hashCode());
        System.out.println(blue.compareTo(Color.black));
        System.out.println(blue.equals(Color.blue));
        System.out.println(blue.equals(2));
        System.out.println(blue==Color.blue);

    }
}
