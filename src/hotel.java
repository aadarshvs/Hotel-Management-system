package _2_ArmyOopsProjects._20_Hotel_Management;

import java.util.ArrayList;
import java.util.List;

public class hotel {
    List<rooms> room = new ArrayList<>();
    List<guest> guests = new ArrayList<>();
    List<reservation> reservations = new ArrayList<>();
    int reservationCounter = 0;

    void addRoom(rooms r){
        room.add(r);
        System.out.println("Room added successfully");
    }

    void addGuest(guest g ){
        guests.add(g);
        System.out.println("Guest added successfully");
    }

    rooms searchRoom(int roomId){
        for (rooms r : room){
            if (r.roomNo == roomId)return r;
        }
        return null;
    }

    guest  searchGuest(int guestId){
        for (guest g : guests){
            if (g.getGuestId() == guestId) return g;
        }
        return null;
    }

    reservation searchReservation(int reservationId){
        for (reservation r : reservations){
            if (reservationId == r.getReservationId()) return r;
        }
        return null;
    }

    void bookRoom(int guestId, int roomId, int nights){
        rooms r = searchRoom(roomId);
        if (r == null){
            System.out.println("Room not found");
            return;
        }
        guest g = searchGuest(guestId);
        if (g == null){
            System.out.println("Room not found");
            return;
        }
        if (r.isBooked()){
            System.out.println("room is already booked");
            return;
        }
        if (nights <= 0) {
            System.out.println("Book room for a night");
            return;
        }

        double bill = r.calBill(nights);
        r.setBooked(true);
        reservations.add(new reservation(reservationCounter++, guestId, roomId , nights,bill));
        System.out.printf("Room booked Successfully. Total bill %.2f ",bill);
    }

    void checkout(int reservationId){
        reservation rev = searchReservation(reservationId);
        if (rev == null) {
            System.out.println("no Reservation ");
            return;
        }
        if (rev.getStatus().equals("checked out")){
            System.out.println("Already checked out");
            return;
        }
        rooms r = searchRoom(rev.getRoomNo());
        if (r != null) r.setBooked(false);
        rev.setStatus("Checked out");
        System.out.println("Checked out Successfully. Room Available");
    }

    void showAvailableRooms() {
        boolean found = false;
        for (rooms r : room)
            if (!r.isBooked()) { r.display(); found = true; }
        if (!found) System.out.println("No rooms available.");
    }

    void showAllRooms(){
        if (room.isEmpty()){System.out.println("No Rooms");return;}
        room.forEach(rooms :: display);
    }

    void showReservation(){
        if (reservations.isEmpty()){System.out.println("No Reservation"); return;}
        reservations.forEach(reservation :: display);
    }

}




































