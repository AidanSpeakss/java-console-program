package com.devaidan.uwstout;

import java.text.DecimalFormat;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;
    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
        car = aCar;
        officer = anOfficer;
        minutes = min;
    }

    public ParkingTicket(ParkingTicket ticket2) {

    }

    public void calculateFine() {
        if (minutes >= 30) {
            DecimalFormat df = new DecimalFormat("#.##");
            fine = Double.parseDouble(df.format(25 + (Math.round(((double) minutes - 60) / 60)) * 10));
        } else {
            fine = 25;
        }
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public ParkedCar getCar() {
        return car;
    }

    public double getFine() {
        return fine;
    }

    public int getMinutes() {
        return minutes;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    @Override
    public String toString() {
        return "Ticket {\n" + car + ",\n" + officer + ",\n" + "Ticket Details {\n  Fine: \"$" + fine + "\",\n" + "  Minutes: \"" + minutes + "\"\n" + "}\n}";
    }
}
