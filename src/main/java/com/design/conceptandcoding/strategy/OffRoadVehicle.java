package com.design.conceptandcoding.strategy;

import com.design.conceptandcoding.strategy.handlers.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
