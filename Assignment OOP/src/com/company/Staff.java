package com.company;

import java.text.*;
import java.util.*;

public class Staff {
    private String staffID;
    private String staffUserName;
    private String password;
    private Date DOB;
    private String address;
    private int telephoneNo;
    private String gender;
    //Constructor--Initializes the variables while initializing the the class
    public Staff(String staffID, String staffUserName, String password, String DOB,
                 String address, int telephoneNo, String gender) throws ParseException {
        setStaffID(staffID);
        setStaffUserName(staffUserName);
        setPassword(password);
        setDOB(DOB);
        setAddress(address);
        setTelephoneNo(telephoneNo);
        setGender(gender);
    }

    public Staff() {

    }

    //Accessors--Allows the access to the data saved in the class
    public String getStaffID(){return this.staffID;}
    public String getStaffUserName(){return this.staffUserName;}
    public String getPassword(){return this.password;}
    public Date getDOB(){return this.DOB;}
    public String getAddress(){return this.address;}
    public int getTelephoneNo(){return this.telephoneNo;}
    public String getGender(){return this.gender;}

    //Mutators--Allows the saving of data into the class
    private void setStaffID(String staffID){this.staffID = staffID;}
    private void setStaffUserName(String staffUserName){this.staffUserName = staffUserName;}
    private void setPassword(String password){this.password = password;}
    private void setDOB(String DOB) throws ParseException {
        try {
            this.DOB = new SimpleDateFormat("dd/MM/yy").parse(DOB);
        }catch (ParseException PE){
            System.out.println(PE.getMessage());
        }
    }
    private void setAddress(String address){this.address = address;}
    private void setTelephoneNo(int telephoneNo){this.telephoneNo = telephoneNo;}
    private void setGender(String gender){this.gender = gender;}

    //Display the details of the staffs
    public void displayDetails(){
        System.out.println("*** STAFF DETAILS ***");
        System.out.println("ID: "+getStaffID()+"\nUsername: "+getStaffUserName()+
                "\nDOB: "+getDOB()+"\nAddress: "+getAddress()+
                "\nTelephone Number: "+getTelephoneNo()+"\nGender: "+getGender());
    }
}

