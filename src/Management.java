package _2_ArmyOopsProjects._20_Hotel_Management;

import java.util.Scanner;

public class Management {
    static void main() {
        hotel hotels = new hotel();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Add Standard Room");
            System.out.println("2. Add Deluxe Room");
            System.out.println("3. Add Suite Room");
            System.out.println("4. Add Guest");
            System.out.println("5. Book Room");
            System.out.println("6. Checkout");
            System.out.println("7. Show Available Rooms");
            System.out.println("8. Show All Rooms");
            System.out.println("9. Show Reservations");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.print("RoomNo BasePrice: ");
                    hotels.addRoom(new standardRoom(input.nextInt(), input.nextDouble()));
                }
                case 2 -> {
                    System.out.print("RoomNo BasePrice ServiceCharge: ");
                    hotels.addRoom(new deluxRoom(input.nextInt(), input.nextDouble(),input.nextDouble()));
                }
                case 3 -> {
                    System.out.print("RoomNo BasePrice ServiceCharge Breakfast(true/false): ");
                    hotels.addRoom(new suiteRoom(input.nextInt(), input.nextDouble(),
                            input.nextDouble(), input.nextBoolean()));
                }
                case 4 -> {
                    System.out.print("GuestId Name Phone: ");
                    hotels.addGuest(new guest(input.nextInt(), input.next(), input.next()));
                }
                case 5 -> {
                    System.out.print("GuestId RoomNo Nights: ");
                    hotels.bookRoom(input.nextInt(), input.nextInt(), input.nextInt());
                }
                case 6 -> {
                    System.out.print("ReservationId: ");
                    hotels.checkout(input.nextInt());
                }
                case 7 -> hotels.showAvailableRooms();
                case 8 -> hotels.showAllRooms();
                case 9 -> hotels.showReservation();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        }while(choice !=0 );
    }
}
