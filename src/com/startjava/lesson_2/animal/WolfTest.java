package com.startjava.lesson_2.animal;

import com.startjava.lesson_2.animal.Wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setName("Baron");
        wolf.setWeight(4.5);
        wolf.setAge(10);
        wolf.setColor("grey");

        System.out.println("Gender = " + wolf.getGender());
        System.out.println("Name = " + wolf.getName());
        System.out.println("Weight = " + wolf.getWeight());
        System.out.println("Age = " + wolf.getAge());
        System.out.println("Color = " + wolf.getColor());

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}