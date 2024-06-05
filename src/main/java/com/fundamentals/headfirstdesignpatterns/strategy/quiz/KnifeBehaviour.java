package com.fundamentals.headfirstdesignpatterns.strategy.quiz;

public class KnifeBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("I am using a knife");
    }
}
