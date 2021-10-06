public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public String toString()    {       //returns all strings
        return AddressLine1 + AddressLine2 + City + State + PostalCode;
    }

    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode)    {

    }

}
