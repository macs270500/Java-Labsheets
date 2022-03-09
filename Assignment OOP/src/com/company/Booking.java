package com.company;

public class Booking extends Staff {
    private  int BookingID;
    private double Payment;
    RoomSlot rs;

    public Booking(){}

    public Booking(int BookingID, double Payment) throws InvalidPaymentException {
        setBookingID(BookingID);
        setPayment(Payment);
    }

    //Accessors--Allows the access to the data saved in the class
    public int getBookingID(){return this.BookingID;}
    public double getPayment() {return this.Payment;}

    //Mutators--Allows the saving of data into the class
    private void setBookingID(int BookingID){this.BookingID = BookingID;}
    private void setPayment(double Payment) throws InvalidPaymentException{
        try{
            if(Payment < 5000){
                throw new InvalidPaymentException("Invalid Payment Exception");
            }
            else{
            this.Payment = Payment;
            }
        }catch(InvalidPaymentException IPE){
            System.out.println(IPE.getMessage());
        }
    }

    //Displays the details of the bookings made
    public void displayDetails(){
        System.out.println("*** BOOKING DETAILS ***");
        System.out.println("BookingID: "+getBookingID()+"\nRoom Number: "+rs.getRoomNum()+
                "\nPayment: "+getPayment()+"\nTime In: "+rs.getTimeIn()+"\nTime Out: "+rs.getTimeOut());
    }
}

class InvalidPaymentException extends Exception{
    public InvalidPaymentException(String message){
        super(message);
    }
}
