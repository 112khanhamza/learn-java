package com.design.headfirstdesignpatterns.strategy.quiz;

import lombok.Setter;

@Setter
public abstract class Character {

    private WeaponBehaviour weaponBehaviour;

    public void fight() {
        weaponBehaviour.useWeapon();
    }

    abstract void display();
}
