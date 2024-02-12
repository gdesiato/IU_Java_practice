package main;

import java.util.ArrayList;

class Person {

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            Person per = (Person)o;
            if(per.getName().equals(this.name) && per.getAge() == this.age){
                return true;
            }
        }
        return false;
    }
}

public class ArrayLIstTest {

    public static void main(String[] args){

        ArrayList<Person> personList = new ArrayList<>();

        Person p = new Person("Gigi", 34);
        Person p1 = new Person("Giorgia", 35);
        Person p2 = new Person("Gino", 36);

        personList.add(p);
        personList.add(p1);
        personList.add(p2);
        personList.add(new Person("Giorgia", 20));

        System.out.println(personList);

        for(Person person : personList){
            System.out.println(person.getName() + " " + person.getAge());
        }

        System.out.println(personList.contains(p1));
        System.out.println(personList.contains(new Person("Giorgia", 35)));
    }


}


