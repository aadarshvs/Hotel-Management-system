package _2_ArmyOopsProjects._20_Hotel_Management;

public class suiteRoom extends rooms{
    double serviceCharge;
    boolean breakfastIncluded;

    public suiteRoom(int roomNo, double basePrice,double serviceCharge,boolean breakfastIncluded) {
        super(roomNo, basePrice);
        this.serviceCharge = serviceCharge;
        this.breakfastIncluded = breakfastIncluded;
    }

    double totalCost;
    @Override
    public double calBill(int nights) {
        totalCost = serviceCharge + (nights * basePrice );
        if (breakfastIncluded) totalCost += 500 * nights;
        return totalCost;
    }
    @Override
    public void display(){
        System.out.printf("roomNo %d | basePrice %.2f | Total Price %.2f | %s%n ",roomNo,basePrice,totalCost,booked ? "booked" : "Available");
    }
}
