/*
    ParkingLot automation system

    Step1: Create required Enums.
    Step2: Vehicle Hierarchy creation.
    Step3: Vehicle factory creation (Factory Pattern).
    Step4: ParkingSpot Hierarchy.
    Step5: ParkingObserver Class.
    Step6: ParkingFloor Class 
    Step7: ParkingDisplayBoard(Observer Pattern)
    Step8: ParkingStrategy Class (Strategy Pattern).
    Step9: PricingStrategy Class (Strategy Pattern).
    Step10: PaymentStrategy Class
    Step11: ParkingTicket Class
    Step12: EntryGate Class
    Step13: ExitGate Class
    Step14: ParkingLot Class.(Singleton Class)
    Step15: Main Class (Controller)

*/

import java.util.*;
import java.time.Duration;
import java.time.LocalDateTime;

//////////////////////////////////////////////////////////////////////////
//  Step1: Create Enums
//  It is used to create fixed constants which are required 
//  throughout the project
//////////////////////////////////////////////////////////////////////////

//Represent the different types of vehicles supported by our project
enum VehicleType
{
    BIKE,
    CAR,
    TRUCK

}
//Different types of parking spots
enum SpotType
{
    BIKE,
    CAR,
    TRUCK
}
//Represents the current state of parking ticket.
enum TicketStatus
{
    ACTIVE,
    CLOSED

}

class program996
{
    public static void main(String A[])
    {

    }
}