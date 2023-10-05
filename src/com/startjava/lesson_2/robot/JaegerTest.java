package com.startjava.lesson_2.robot;

import com.startjava.lesson_2.robot.Jaeger;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 
                76.2f, 1850f, 10, 10, 9);

        System.out.println("\nInformation on Jaeger 1");
        System.out.println("ModelName: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight() + "m");
        System.out.println("Weight: " + jaeger1.getWeight() + "tons");
        System.out.println("Speed: " + jaeger1.getSpeed());
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Cherno Alpha");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Russia");
        jaeger2.setHeight(85.34f);
        jaeger2.setWeight(2412f);
        jaeger2.setSpeed(3);
        jaeger2.setStrength(10);
        jaeger2.setArmor(10);

        System.out.println("\nInformation on Jaeger 2");
        System.out.println("ModelName: " + jaeger2.getModelName());
        System.out.println("Mark: " + jaeger2.getMark());
        System.out.println("Origin: " + jaeger2.getOrigin());
        System.out.println("Height: " + jaeger2.getHeight() + "m");
        System.out.println("Weight: " + jaeger2.getWeight() + "tons");
        System.out.println("Speed: " + jaeger2.getSpeed());
        System.out.println("Strength: " + jaeger2.getStrength());
        System.out.println("Armor: " + jaeger2.getArmor());

        jaeger1.setModelName("Striker Eureka 2.0");
        System.out.println("\nModelName new version Jaeger 1: " + jaeger1.getModelName());
        jaeger2.setSpeed(8);
        System.out.println("\nNew speed Jaeger 2: " + jaeger2.getSpeed());

        System.out.print("\nJaeger 1 ");
        jaeger1.useVortexCannon();
        System.out.print("Jaeger 2 ");
        jaeger2.useVortexCannon();

        System.out.println("\nDrift check Jaeger 1: " + jaeger1.drift());
        System.out.println("Drift check Jaeger 2: " + jaeger2.drift());

        System.out.println("\nJaeger 1 " + jaeger1.scanKaiju());
        System.out.println("Jaeger 2 " + jaeger2.scanKaiju());

        System.out.print("\nJaeger 1 ");
        jaeger1.move();
        System.out.print("Jaeger 2 ");
        jaeger2.move();
        System.out.println();
        
        String nameJaeger1 = jaeger1.getModelName();
        jaeger1.attack(nameJaeger1);
        String nameJaeger2 = jaeger2.getModelName();
        jaeger2.attack(nameJaeger2);
    }
}