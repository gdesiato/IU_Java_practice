package main;

public class Vehicle {

    double currentSpeed;
    double maxSpeed;
    String manufacturingDate;


    public Vehicle(double currentSpeed, double maxSpeed, String manufacturingDate) {
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.manufacturingDate = manufacturingDate;

    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
}
