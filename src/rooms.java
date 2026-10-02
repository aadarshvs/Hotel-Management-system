package _2_ArmyOopsProjects._20_Hotel_Management;

abstract class rooms implements Billable{
    int roomNo;
    double basePrice;
    boolean booked;

    public rooms(int roomNo, double basePrice) {
        this.roomNo = roomNo;
        this.basePrice = basePrice;
        this.booked = false;
    }

    public abstract double calBill(int nights);

    boolean isBooked(){
        return booked;
    }
    public void setBooked(boolean booked){
        this.booked = booked;
    }
    int getRoomNo(){
        return roomNo;
    }

    public void display(){
        System.out.printf("roomNo %d basePrice %.2f | %s%n ",roomNo,basePrice,booked ? "booked" : "Available");
    }

}
