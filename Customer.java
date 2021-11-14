/*
Ross Wylie
11-12-2021
JDK 1.8
COSC 1437.001
*/
/********************** Chapter 10 Assignment *********************************/
package person.and.customer.classes;
public class Customer extends Person 
{
    private String customerNumber;
    private boolean mailList;
    
    //Constructor with no arguments
    public Customer ()
    {
        customerNumber = "";
        mailList = false;
    }
   //Constructor that initializes
    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean mailList){
       super(name, address, phoneNumber);
       this.customerNumber = customerNumber;
       this.mailList = mailList;
   }
    //Mutators
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    public void setMailList(boolean mailList)
    {
        this.mailList = mailList;
    }
    //Accessors
    public String getCustomerNumber(String customerNumber)
    {
        return customerNumber;   
    }
    public boolean getMailList(boolean mailList)
    {
        return mailList;
    }
}
