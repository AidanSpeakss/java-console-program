package com.devaidan.uwstout;

public class PoliceOfficer {
    private String name;
    private String badgeNumber;
    public PoliceOfficer(String n, String bn){
        name = n;
        badgeNumber = bn;
    }
    public PoliceOfficer(PoliceOfficer officer2){
    }
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter){
        int illegalMinutes = Math.abs(meter.getMinutesPurchased() - car.getMinutesParked());
        ParkingTicket ticket = null;
        if(illegalMinutes > 0){
            ticket = new ParkingTicket(car, new PoliceOfficer(name,badgeNumber), illegalMinutes);
            ticket.calculateFine();
        }
        return ticket;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Police Officer {\n  name: \"" + name + "\",\n" + "  badgeNumber: \"" + badgeNumber + "\"\n" + "}";
    }
}
