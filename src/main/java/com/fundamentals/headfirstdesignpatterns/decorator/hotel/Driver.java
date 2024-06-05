package com.fundamentals.headfirstdesignpatterns.decorator.hotel;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 4) {
            System.out.println("Welcome to Majestic Suites");
            System.out.println("Please select one of the below rooms available: ");
            System.out.println("1. Suite Room");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1) {
                Room room = new SuiteRoom();
                room = checkForServices(room, sc, "laundry");
                room = checkForServices(room, sc, "freezer");
                System.out.println(room.getDescription() + ", " + room.getCost());
                break;
            } else {
                System.out.println("Please select a valid option.\n");
                counter++;
            }
        }

        if (counter > 3)
            System.out.println("Invalid option selected more than 3 times. System Exit.");
        else
            System.out.println("Thank you.");
    }

    private static Room checkForServices(Room room, Scanner sc, String service) {
        System.out.printf("Did the customer use %s?\n", service);
        String input = sc.next();
        if (input.equalsIgnoreCase("yes") ||
                input.equalsIgnoreCase("y")) {
            switch (service) {
                case "laundry":
                    room = new RoomLaundryCharges(room);
                    break;
                case "freezer":
                    room = new RoomFreezerCharge(room);
                    break;
                default:
                    break;
            }
            return room;
        }
        return room;
    }

    private static Room checkForLaundryServices(Room room, Scanner sc) {
        System.out.println("Did the customer use laundry?");
        String laundryInput = sc.next();
        if (laundryInput.equalsIgnoreCase("yes") ||
                laundryInput.equalsIgnoreCase("y")) {
            room = new RoomLaundryCharges(room);
            return room;
        }
        return room;
    }

    private static Room checkForFreezerServices(Room room, Scanner sc) {
        System.out.println("Did the customer use the freezer?");
        String freezerInput = sc.next();
        if (freezerInput.equalsIgnoreCase("yes") ||
                freezerInput.equalsIgnoreCase("y")) {
            room = new RoomFreezerCharge(room);
            return room;
        }
        return room;
    }
}
