package com.design.conceptandcoding.strategy;

import com.design.conceptandcoding.strategy.handlers.DriveStrategy;

// base class
public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
