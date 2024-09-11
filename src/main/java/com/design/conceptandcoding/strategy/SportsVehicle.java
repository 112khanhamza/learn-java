package com.design.conceptandcoding.strategy;

import com.design.conceptandcoding.strategy.handlers.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
