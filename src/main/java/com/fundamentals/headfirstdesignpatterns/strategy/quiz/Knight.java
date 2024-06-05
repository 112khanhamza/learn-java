package com.fundamentals.headfirstdesignpatterns.strategy.quiz;

public class Knight extends Character {

    public Knight() {
        setWeaponBehaviour(new KnifeBehaviour());
    }

    @Override
    void display() {
        System.out.println("I am a Knight");
    }
}
