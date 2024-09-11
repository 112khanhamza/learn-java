package com.design.conceptandcoding.strategy.handlers;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}
