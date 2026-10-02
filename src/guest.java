package _2_ArmyOopsProjects._20_Hotel_Management;

public class guest {
    private final int guestId;
    private final String name;
    private final String phone;

    public guest(int guestId, String name, String phone) {
        this.guestId = guestId;
        this.name = name;
        this.phone = phone;
    }

    void display(){
        System.out.printf("Guest ID %d | Name %s | PH.no %s",guestId,name,phone);
    }

    public int getGuestId() {
        return guestId;
    }
    
}
