package com.fundamentals.headfirstdesignpatterns.decorator.hotel;

public class SuiteRoom extends Room {

    @Override
    public String getDescription() {
        return "Suite Room";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
