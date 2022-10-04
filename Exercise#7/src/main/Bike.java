package main;

public class Bike extends Vehicle{

    int frameSize;

    public Bike(double currentSpeed, double maxSpeed, String manufacturingDate, int frameSize) {
        super(currentSpeed, maxSpeed, manufacturingDate);
        this.frameSize = frameSize;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public void getDescription(){
        System.out.println("This bike ---- \n" +
                "current speed: " + currentSpeed + "\n" +
                "max speed: " + maxSpeed + "\n" +
                "manufacturing date: " + manufacturingDate + "\n" +
                        "frame size: " + frameSize
        );
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frameSize=" + frameSize +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                '}';
    }
}
