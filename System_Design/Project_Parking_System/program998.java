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

//////////////////////////////////////////////////////////////////////////
//  Step2: Create vehicle class hierarchy
//  It is used to create the multiple types of classes which 
//  represent the types of vehicles.
//  Concept: Abstraction, Inheritance, Polymorphism, Encapsulation
//////////////////////////////////////////////////////////////////////////

//Class which represent a generic vehicle type
abstract class Vehicle
{
    //Abstracted (Hidden) characteristics of class.
    private String vehicleNumber;

    private VehicleType vehicleType;

    //Parameterised constructor.
    public Vehicle(String vehicleNumber, VehicleType vehicleType)
    {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    //Concrete getter method.
    public VehicleType getVehicleType()
    {
        return this.vehicleType;
    }

    //Concrete getter method.
    public String getVehicleNumber()
    {
        return this.vehicleNumber;
    }

    //Every concrete class will provide its own definition.
    public abstract void display();
    
}
//Class which represents the vehicle type as Bike
class Bike extends Vehicle
{
    public Bike(String vehicleNumber)
    {
        //calls vehicle class constructor
        super(vehicleNumber, VehicleType.BIKE);

    }
    //Method overriding
    @Override
    public void display()
    {
        System.out.println("Bike: "+getVehicleNumber());
    }
}

//Class which represents the vehicle type as Car
class Car extends Vehicle
{
    public Car(String vehicleNumber)
    {
        //calls vehicle class constructor
        super(vehicleNumber, VehicleType.CAR);

    }
    //Method overriding
    @Override
    public void display()
    {
        System.out.println("Car: "+getVehicleNumber());
    }
    
}
//Class which represents the vehicle type as Truck
class Truck extends Vehicle
{
    public Truck(String vehicleNumber)
    {
        //calls vehicle class constructor
        super(vehicleNumber, VehicleType.TRUCK);

    }
    //Method overriding
    @Override
    public void display()
    {
        System.out.println("Truck: "+getVehicleNumber());
    }
    
}


//////////////////////////////////////////////////////////////////////////
//  Step3: Create VehicleFactory class
//  It is used to centralised the creation of vehicle objects
//  Concepts : Factory Design Pattern
//////////////////////////////////////////////////////////////////////////

class VehicleFactory
{
    //Creates and return the desired class object

    public static Vehicle creatVehicle(VehicleType type, String number)
    {
        switch(type)
        {
            case BIKE:
                return new Bike(number);
            
            case CAR:
                return new Car(number);
            
            case TRUCK:
                return new Truck(number);
            
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }

    }
}



class program998
{
    public static void main(String A[])
    {

    }
}