package com.fundamentals.headfirstdesignpatterns.strategy.quiz;

public class Driver {

    public static void main(String[] args) {

        Character character = new Knight();
        character.fight();
        character.display();

        character.setWeaponBehaviour(new SwordBehaviour());
        character.fight();

        Character king = new King();
        king.display();
        king.fight();
    }
}
