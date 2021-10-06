public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public String toString()    {       //returns all strings
        return "Address Line 1:  "+AddressLine1+ "\nAddress Line 2: " +AddressLine2+ "\nCity: " +City+ "\nState: " +State+ "Postal Code: " +PostalCode;
    }

    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode)    {

    }

}
