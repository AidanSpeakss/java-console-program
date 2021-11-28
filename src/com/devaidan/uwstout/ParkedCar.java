package com.devaidan.uwstout;

public class ParkedCar {

    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;


    public ParkedCar(String mk, String mod, String col, String lic, int min) {
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutesParked = min;
    }

    public ParkedCar(ParkedCar car2) {
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Parked Car {\n  make: \"" + make + "\",\n" + "  model: \"" + model + "\",\n" + "  licenseNumber: \"" + licenseNumber + "\",\n" + "  color: \"" + color + "\",\n" + "  minutesParked: " + minutesParked + "\n" + "}";
    }
}
