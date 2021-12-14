package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle ferrari = new Vehicle(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);

        System.out.println("Ferrari за по часа проедет" +distance + "км/ч");
        System.out.println("скорость Ferrari:" + ferrari.maxspeed + " км/ч");
    }
}
