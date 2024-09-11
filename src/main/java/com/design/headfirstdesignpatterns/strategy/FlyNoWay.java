package com.design.headfirstdesignpatterns.strategy;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}
