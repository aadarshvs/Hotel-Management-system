package _2_ArmyOopsProjects._20_Hotel_Management;

public class deluxRoom extends rooms{
    double serviceCharge;

    public deluxRoom(int roomNo, double basePrice, double serviceCharge) {
        super(roomNo,basePrice);
        this.serviceCharge = serviceCharge;
    }

    double totalPrice;
    @Override
    public double calBill(int nights) {
        totalPrice = (nights * basePrice) + serviceCharge;
        return totalPrice;
    }

    @Override
    public void display() {
        System.out.printf("roomNo %d | basePrice %.2f | Total Price %.2f | %s%n ",roomNo,basePrice,totalPrice,booked ? "booked" : "Available");
    }
}
