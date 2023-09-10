package com.fundamentals.designpatterns.builder;

public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog.Builder()
                .setGender("male")
                .setBreed("german")
                .setName("tom")
                .setPrice(30000)
                .setAge(15)
                .build();

        System.out.println(dog.getName());
    }
}
