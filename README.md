# Hotel Management System (Java)
# This Project is mainly based on (OOPs) principal

# Encapsulation	Private/protected fields with controlled getters and setters; 
  the booked flag changes only through setBooked(), never directly
  
# Inheritance	StandardRoom, DeluxeRoom, and SuiteRoom extend the abstract Room class

# Abstraction	Room is an abstract base class; Billable is an interface declaring calculateBill()

# Polymorphism	bookRoom() calls calculateBill(nights) on a Room reference — the correct room type's version runs at runtime

# Composition	Hotel manages lists of rooms, guests, and reservations; a Reservation links a guest to a room

Features
  Add rooms of three types (Standard, Deluxe, Suite), each with different pricing
  Register guests
  Book an available room for a given number of nights, with the bill calculated automatically per room type
  Check out of a reservation, which frees the room so it can be booked again
  View available rooms, all rooms, and all reservations

  How to Run
    bash
    # Compile
      javac HotelReservation.java
    # Run
      java HotelReservation
