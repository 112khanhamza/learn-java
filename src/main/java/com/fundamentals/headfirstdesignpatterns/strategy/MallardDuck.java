package com.fundamentals.headfirstdesignpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehaviour(new Squeak());
        setFlyBehaviour(new FlyWithWings());
    }

    @Override
    void display() {
        System.out.println("I am a Mallard Duck");
    }
}
