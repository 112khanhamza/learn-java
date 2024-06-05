package com.fundamentals.headfirstdesignpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    abstract void display();

    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void swim() {
        System.out.println("All ducks float, dummy!");
    }

}
