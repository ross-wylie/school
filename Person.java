/*
Ross Wylie
11-12-2021
JDK 1.8
COSC 1437.001
*/
/********************** Chapter 10 Assignment *********************************/
package person.and.customer.classes;



public class Person 
{
   //Fields holding Persons info
    private String name = null;
    private String address = null;
    String phoneNumber = null;
    //Constructor with empty values;
    public Person()
    {
       name = "";
       address = "";
       phoneNumber = "";
       
    }
    //The other constructor that initializes the variables
    public Person (String name, String address, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = (phoneNumber);
    }
    //Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    //Accessors
    public String getName(String name)
    {
        return name;
    }
    public String getAddress(String address)
    {
        return address;
    }
    public String getPhoneNumber(String phoneNumber)
    {
        return phoneNumber;
    }
}
