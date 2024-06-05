package com.fundamentals.headfirstdesignpatterns.strategy;

public class Driver {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();

        duck.setFlyBehaviour(new FlyNoWay());
        duck.performFly();
    }
}
