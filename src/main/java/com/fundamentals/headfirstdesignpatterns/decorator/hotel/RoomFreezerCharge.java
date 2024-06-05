package com.fundamentals.headfirstdesignpatterns.decorator.hotel;

public class RoomFreezerCharge extends RoomDecorator {

    private Room room;

    public RoomFreezerCharge(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with freezer charge";
    }

    @Override
    public double getCost() {
        return room.getCost() + 15.0;
    }
}
