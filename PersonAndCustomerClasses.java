/*
Ross Wylie
11-12-2021
JDK 1.8
COSC 1437.001
*/
/********************** Chapter 10 Assignment *********************************/
package person.and.customer.classes;
import javax.swing.JOptionPane;
public class PersonAndCustomerClasses 
{
    public static void main(String[] args) 
    {
      
//Initializing all variables
      String phoneNumber = JOptionPane.showInputDialog(null,"Please input your phone number: ", "Customer building system",1);
      String name =  JOptionPane.showInputDialog(null,"Please input your name: ", "Customer building system",1);
      String streetAddress =  JOptionPane.showInputDialog(null,"Please input your street adress: ", "Customer building system",1);
      String customerNumber = JOptionPane.showInputDialog(null,"Please input your customer number: ", "Customer building system",1);
     
//Option for mail-list 
      boolean mailList;
      mailList = JOptionPane.showConfirmDialog(null,"Are you wanting to be apart of our mail list", "In-Mail Promotion System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
      //Customer set-up
      Customer newCust;
      newCust = new Customer (name, streetAddress, phoneNumber, customerNumber, mailList );
        //Final Output page
        JOptionPane.showMessageDialog(null,"The Customers Profile is :" + "\nName: "+ newCust.getName(name) + "\nStreet Address: " + 
                newCust.getAddress(streetAddress) + "\nPhone Number: " + newCust.getPhoneNumber(phoneNumber) + "\nCustomer Number: " +
                newCust.getCustomerNumber(customerNumber) + "\n On the Mail List: " + newCust.getMailList(mailList));
    
      }
}
