package com.devaidan.uwstout;

public class Main {
    public static void main(String[] args) {
        ParkedCar parkedCar = new ParkedCar("Chevy", "2002", "Red", "192EHD", 20);
        System.out.println(parkedCar.toString());
        ParkingMeter parkingMeter = new ParkingMeter(20);
        System.out.println("\nParking Meter Time: " + parkingMeter.getMinutesPurchased());
        PoliceOfficer policeOfficer = new PoliceOfficer("Joe", "85");
        ParkingTicket parkingTicket = new ParkingTicket(parkedCar, policeOfficer, 29);
        parkingTicket.calculateFine();
        System.out.println(parkingTicket.toString());
        System.out.println(policeOfficer.toString());
    }
}

