package com.company;

public class RoomSlot extends Staff  implements RoomDetails{
    private int RoomNum ;
    private boolean Availability;
    private String TimeIn;
    private String TimeOut;


    RoomSlot(int RoomNum){
        setRoomNum(RoomNum);
        setAvailability(Availability);
        setTimeIn(TimeIn);
        setTimeOut(TimeOut);
    }

    public RoomSlot() {
    }

    public int getRoomNum() { return RoomNum; }
    public boolean getAvailability() { return Availability; }
    public String getTimeIn() { return TimeIn; }
    public String getTimeOut() { return TimeOut; }

    public void setRoomNum(int RoomNum) { this.RoomNum = RoomNum; }
    public void setAvailability(boolean Availability) { this.Availability = Availability; }
    public void setTimeIn(String TimeIn) { this.TimeIn = TimeIn; }
    public void setTimeOut(String TimeOut) { this.TimeOut = TimeOut; }

}
class Deluxe extends RoomSlot {

    private double cost;
    public void setPrice(){
        this.cost=10000;
    }
    public Deluxe(){

    }
    public Deluxe(int roomNum,double cost) {
        super(roomNum);
    }
    public double getCost(){return this.cost;}
    public void displayRoomDetails(){
        System.out.println("Room Number: "+getRoomNum()+"\nAvailability: "+getAvailability()+
                "\nCost"+getCost());
    }
}
class Standard extends RoomSlot {

    private double cost;
    public void setPrice(){
        this.cost= 5000;
    }
    public Standard(){
    }
    public Standard(int roomNum) {
        super(roomNum);
    }
    public double getCost(){return this.cost;}
    public void displayRoomDetails(){
        System.out.println("Room Number: "+getRoomNum()+"\nAvailability: "+getAvailability()+
                "\nCost"+getCost());
    }

}
class DoubleStandard extends RoomSlot {

    private double cost;
    public void setPrice(){
        this.cost=7000;
    }
    public DoubleStandard(){

    }
    public DoubleStandard(int roomNum,double cost) {
        super(roomNum);
    }
    public double getCost(){return this.cost;}
    public void displayRoomDetails(){
        System.out.println("Room Number: "+getRoomNum()+"\nAvailability: "+getAvailability()+
                "\nCost"+getCost());
    }
}

