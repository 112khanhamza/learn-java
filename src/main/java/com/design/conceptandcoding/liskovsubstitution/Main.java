package com.design.conceptandcoding.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vList = new ArrayList<>();
        vList.add(new MotorCycle());
        vList.add(new Car());
        vList.add(new Bicycle());

        for (Vehicle v : vList) {
            if (v instanceof EngineVehicle) {
                System.out.println(((EngineVehicle) v).hasEngine().toString());
            }
        }
    }
}
