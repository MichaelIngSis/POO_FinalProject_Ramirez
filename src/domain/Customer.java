package domain;
import java.util.LinkedList;
import java.util.List;
import java.io.*;
/*This class is used to create and manage customers for the ticket office */
public class Customer implements Serializable{
    private int customerId;
    private String customerName;
    private String customerLastname;
    private String customerAddress;
    private String customerEmail;
    private String customerPhoneNumber;
    private List<Ticket> tickets;

    //Constructor of the Class
    public Customer(int customerId, String customerName, String customerLastname,
                    String customerAddress, String customerEmail, String customerPhoneNumber){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLastname = customerLastname;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.tickets = new LinkedList<>();
    }

    //Update customer address 
    public void setCustomerAddress(String newCustomerAddress){
        if(!newCustomerAddress.equals("")){
            customerAddress = newCustomerAddress;
        }
    }

    //Update customer email
    public void setCustomerEmail(String newCustomerEmail){
        if(!newCustomerEmail.equals("")){
            customerEmail = newCustomerEmail;
        }
    }
    
    //Update customer phone number. 
    public void setCustomerPhoneNumber(String newCustomerPhoneNumber){
        if(!newCustomerPhoneNumber.equals("")){
            customerPhoneNumber = newCustomerPhoneNumber;
        }
    }

    //Save ticket in the list tickets
    public void saveTicket(Ticket ticket){
        tickets.add(ticket);
    }

    //Print the customer fields on the screen (improve visualization)
    @Override
    public String toString() {
        return customerId + " - " + customerName + " " + customerLastname;
    }

    //Return customer fields
    public List<Ticket> getTickets(){return tickets;}
    public int getCustomerId(){return customerId;}
    public String getCustomerName(){return customerName;}
    public String getCustomerLastname(){return customerLastname;}
    public String getCustomerAddress(){return customerAddress;}
    public String getCustomerEmail(){return customerEmail;}
    public String getCustomerPhoneNumber(){return customerPhoneNumber;}
}
