package main;

public class Car extends Vehicle{

    int motor;

    public Car(double currentSpeed, double maxSpeed, String manufacturingDate, int motor) {
        super(currentSpeed, maxSpeed, manufacturingDate);
        this.motor = motor;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void getDescription(){
        System.out.println("This car ---- \n" +
                "current speed: " + currentSpeed + "\n" +
                "max speed: " + maxSpeed + "\n" +
                "manufacturing date: " + manufacturingDate + "\n" +
                "motor: " + motor
        );
    }

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                '}';
    }
}
