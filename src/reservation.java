package _2_ArmyOopsProjects._20_Hotel_Management;

public class reservation {
    private final int reservationId;
    private final int guestId;
    private final int roomNo;
    private final int nights;
    private final double totalBill;
    private String status;

    public reservation(int reservationId, int guestId, int roomNo, int nights, double totalBill) {
        this.reservationId = reservationId;
        this.guestId = guestId;
        this.roomNo = roomNo;
        this.nights = nights;
        this.totalBill = totalBill;
        this.status = "Booked" ;
    }

    int getReservationId(){return reservationId;}

    String getStatus(){return status;}

    void setStatus(String status){this.status = status;}

    int getRoomNo(){return  roomNo;}

    public void display(){
        System.out.printf("ReservationId %d GuestId %d RoomNo %d Nights %d Total Bill %.2f Status %s"
                ,reservationId,guestId,roomNo,nights,totalBill,status);
    }
}
