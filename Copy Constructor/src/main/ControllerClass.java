package main;

public class ControllerClass {

    public static void main(String[] args) {

        Runner runner = new Runner();
        Biker biker = new Biker();

        runner.doSomething("Mario", "Mizuno");
        biker.bikeWith("Giovanni", "MolteniSport");

    }

}
