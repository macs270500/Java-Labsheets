package com.company;

public class Client extends Staff {
    private  int ClientNIC;
    private String ClientName;
    private String address;
    private int ContactNum;

    public Client(int ClientNIC,String ClientName, String address, int ContactNum)
    {
        setClientNIC(ClientNIC);
        setClientName(ClientName);
        setAddress(address);
        setContactNum(ContactNum);
    }

    //Accessors--Allows the access to the data saved in the class
    public int getClientNIC(){return ClientNIC;}
    public String getClientName(){return ClientName;}
    public String getAddress(){return address;}
    public int getContactNum(){return ContactNum;}

    //Mutators--Allows the saving of data into the class
    private void setClientNIC(int ClientNIC){this.ClientNIC = ClientNIC;}
    private void setClientName(String ClientName){this.ClientName = ClientName;}
    private void setAddress(String address){this.address = address;}
    private void setContactNum(int ContactNum){this.ContactNum = ContactNum;}

    //Displays the details of the client
    public void displayClientDetails(){
        System.out.println("*** CLIENT DETAILS ***");
        System.out.println("NIC: "+getClientNIC()+"\nName: "+getClientName()+
                "\nAddress: "+getAddress()+"\nContact Number: "+getContactNum());
    }
}
