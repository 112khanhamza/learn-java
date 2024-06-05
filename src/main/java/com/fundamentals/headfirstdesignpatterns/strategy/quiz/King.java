package com.fundamentals.headfirstdesignpatterns.strategy.quiz;

public class King extends Character {

    public King() {
        setWeaponBehaviour(new SwordBehaviour());
    }

    @Override
    void display() {
        System.out.println("I am a king!!!");
    }
}
