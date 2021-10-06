package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;

    public static void main(String[] args) {

    }
    public void Store() throws IOException {
        var fileName = "Customers.txt";
        var allLines = Files.readString(Paths.get(fileName));
    }
    public void runStore()  {

    }

    public void makeOrder()  {

    }

    public void addCustomer()    {

    }

    public Customer selectCustomer() {

    }
    public String manageCustomer(Customer selectCustomer)    {

    }

}
