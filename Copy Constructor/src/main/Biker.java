package main;

public class Biker implements ActivePeople{

    private String brand;
    private String name;
    private String bikeTeam;

    @Override
    public void doSomething(String name, String brand) {
        System.out.println(name + " is using a " + brand);

    }

    public void bikeWith(String name, String bikeTeam){
        System.out.println(name + " competes with the team: " + bikeTeam );
    }

    public Biker(){

    }

    public Biker(String brand, String name, String bikeTeam) {
        this.brand = brand;
        this.name = name;
        this.bikeTeam = bikeTeam;
    }

    // Copy Constructor
    public Biker(Biker biker){
        brand = biker.brand;
        name = biker.name;
        bikeTeam = biker.bikeTeam;
    }
}

