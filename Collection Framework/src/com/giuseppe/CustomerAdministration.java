package com.giuseppe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomerAdministration {

    public static void main(String[] args) {
        CustomerAdministration customerAdministration = new CustomerAdministration();
        Collection<Customer> collectionTest = customerAdministration.customer;
        customerAdministration.printCustomers(collectionTest);
        customerAdministration.removeAllCustomers(collectionTest);

    }//main

    private Collection<Customer> customer; // only declaration, no memory reserved
    private Main customerStorage;

    // constructor
    public CustomerAdministration(){

        this.customer = new ArrayList<Customer>();
        customer.add(new Customer("Ulf", "Koll"));
        customer.add(new Customer("Ilse", "Stahl"));
        customer.add(new Customer("Rita", "Kafka"));

        customerStorage = new Main();
    }

    public void updateAllCustomers(){

    }

    public void removeAllCustomers(Collection<Customer> c){
        Customer k = null;
        Iterator<Customer> it = c.iterator();
        while(it.hasNext()){
            k = it.next();
            if((k.getSex() == null) || k.getSex().equals("")){
                it.remove();
                System.out.println("Removing customer First Name=" + k.getFirstName() + " Last Name =" + k.getName());
                System.out.println("An element was removed from the collection");
            }
        }
    }

    public void printCustomers(Collection<Customer> customerCollection){
        for(Customer customer : customerCollection){
            System.out.println(customer.toString());
        }
    }



}
