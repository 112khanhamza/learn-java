package com.fundamentals.designpatterns.decorator.hotel;

public class RoomLaundryCharges extends RoomDecorator {

    private Room room;

    public RoomLaundryCharges(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with laundry services";
    }

    @Override
    public double getCost() {
        return room.getCost() + 10.0;
    }
}
