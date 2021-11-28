package com.devaidan.uwstout;

public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int m) {
        minutesPurchased = m;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
}
