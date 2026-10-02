package _2_ArmyOopsProjects._20_Hotel_Management;

public class standardRoom extends rooms{

    public standardRoom(int roomNo, double basePrice) {
        super(roomNo, basePrice);
    }
    double rent;

    @Override
    public double calBill(int nights) {
         rent = nights * basePrice;
        return rent ;
    }

    @Override
    public void display() {
        System.out.printf("roomNo %d | basePrice %.2f | Cost_Rent %.2f | %s%n ",roomNo,basePrice,rent,booked ? "booked" : "Available");
    }
}
