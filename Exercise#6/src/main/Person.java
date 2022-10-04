package main;

public class Person {

    private String firstName, lastName, dateOfBirth;

    //Constructor 1
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Constructor 2
    public Person(String firstName, String lastName, String dateOfBirth) {
        this(firstName, lastName);
        this.dateOfBirth = dateOfBirth;
    }

    //Constructor 3
    public Person(Person person) {
        this(person.firstName, person.lastName, person.dateOfBirth);
    }

    public String toString() {
        return firstName + " " + lastName + " was born on " + dateOfBirth;
    }

}
