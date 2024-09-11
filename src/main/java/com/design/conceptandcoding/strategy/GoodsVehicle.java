package com.design.conceptandcoding.strategy;

import com.design.conceptandcoding.strategy.handlers.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
