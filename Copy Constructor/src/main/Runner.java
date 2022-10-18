package main;

public class Runner implements ActivePeople {

    private String brand;
    private String name;

    @Override
    public void doSomething(String name, String brand) {
        System.out.println(name + " is using " + brand);
    }
}
