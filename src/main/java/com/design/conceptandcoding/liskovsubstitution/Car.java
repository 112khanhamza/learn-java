package com.design.conceptandcoding.liskovsubstitution;

public class Car extends EngineVehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
