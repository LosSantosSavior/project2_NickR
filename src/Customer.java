import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private ArrayList<ShippingAddress> Addresses;
    private String Name;
    private int customerID;

    public String getName() {
        return Name;
    }

    public ShippingAddress addAddress(ShippingAddress newAddress)  {
        System.out.println("Enter your address:");
    }

    public Customer customerName(String custName)  {
        System.out.println("");
    }

    public String toString()    {
        return "Address: " + Addresses + "\nName: " + Name + "Customer ID: " + customerID;
    }
}
