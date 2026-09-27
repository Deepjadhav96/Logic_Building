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

//////////////////////////////////////////////////////////////////////////
//  Step4: Create ParkingSpot Hierarchy.
//  It is used to create hierarchy of parking spot
//  Concept: Encapsulation, Abstraction, Polymorphism, Inheritance
//////////////////////////////////////////////////////////////////////////

abstract class ParkingSpot
{
    //Unique number for parking spot (Primary key)
    private int spotNumber;

    //Type of parking spot
    private SpotType spotType;

    //Indicates whether the spot is currently occupied or not.
    private boolean occupied;

    //Stores info about the vehicle.
    private Vehicle vehicle; 

    //Parameteried constructor
    public ParkingSpot(int spotNumber, SpotType spotType)
    {
        this.spotNumber = spotNumber;
        this.spotType = spotType;

        //Initialised with default values
        this.occupied = false;
        this.vehicle = null;

    }

    public int getSpotNumber()
    {
        return this.spotNumber;
    }

    public SpotType getSpotType()
    {
        return this.spotType;
    }

    public boolean isOccupied()
    {
        return this.occupied;
    }

    public Vehicle getVehicle()
    {
        return this.vehicle;
    }

    //It is used to parked the vehicle.
    public void parkVehicle(Vehicle vehicle)
    {
        if(this.occupied == true)
        {
            throw new RuntimeException("Parking spot is already occupied");
        }
        else
        {
            this.vehicle = vehicle;
            this.occupied = true;
            
        }

    }

    public Vehicle removeVehicle()
    {
        if(this.occupied == true)
        { 
            Vehicle temp = vehicle;

            this.vehicle = null;
            this.occupied = false;

            return temp;

        }
        else
        {
            throw new RuntimeException("Parking spot is already empty");


        }

    }

    //This method decides whether we can park it in the spot or not
    public abstract boolean canFitVehicle(Vehicle vehicle);

    public void display()
    {
        System.out.println("Spot : "+spotNumber+"["+spotType+"]");

        if(this.occupied == true)
        {
            System.out.println("Occupied by: "+vehicle.getVehicleNumber());
        }
        else
        {
            System.out.println("Spot is available");
        }
    }

}//End of ParkingSpot class

class BikeSpot extends ParkingSpot
{

    public BikeSpot(int spotNumber)
    {
        super(spotNumber, SpotType.BIKE);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        if (vehicle.getVehicleType() == VehicleType.BIKE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class CarSpot extends ParkingSpot
{

    public CarSpot(int spotNumber)
    {
        super(spotNumber, SpotType.CAR);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        if (vehicle.getVehicleType() == VehicleType.CAR)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class TruckSpot extends ParkingSpot
{

    public TruckSpot(int spotNumber)
    {
        super(spotNumber, SpotType.TRUCK);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        if (vehicle.getVehicleType() == VehicleType.TRUCK)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

//////////////////////////////////////////////////////////////////////////
//  Step5: Create ParkingObserver class
//  It is used to automatically update display board when the
//  parking availability changes.
//  Concept: Observer Design pattern
//////////////////////////////////////////////////////////////////////////

interface ParkingObserver
{
    void update();
}

//////////////////////////////////////////////////////////////////////////
//  Step6: Create ParkingFloor class
//  It is used to manage parking floor
//  Concept: Composition, ArrayList, Object management
//////////////////////////////////////////////////////////////////////////

class ParkingFloor
{
    //Unique floor number
    private int floorNumber;

    //Collection of all parking spots
    private List<ParkingSpot> parkingSpots;

    //Collection of observers registered for the floor
    private List<ParkingObserver> observers;

    public ParkingFloor(int floorNumber)
    {
        this.floorNumber = floorNumber;

        this.parkingSpots = new ArrayList<>();

        this.observers = new ArrayList<>();
    }

    public int getFloorNumber()
    {
        return this.floorNumber;
    }

    public void addParkingSpot(ParkingSpot spot)
    {
        parkingSpots.add(spot);
        
    }
    public void addObserver(ParkingObserver observer)
    {
        observers.add(observer);
    }

    private void notifyObservers()
    {
        for(ParkingObserver observer : observers)
        {
            observer.update();
        }
    }

    //Method is going to search the parkingspot for specific type of vehicle.
    public ParkingSpot findAvailableSpot(Vehicle vehicle)
    {

        for(ParkingSpot spot: parkingSpots)
        {
            if(!spot.isOccupied() && spot.canFitVehicle(vehicle))
            {
                return spot;
            }
        }
        
        return null;
    }

    //Called when new vehicle gets parked
    public void occupySpot(ParkingSpot spot, Vehicle vehicle)
    {
        //Allocate spot for the vehicle
        spot.parkVehicle(vehicle);

        //Notify all observers about the availability of spots.
        notifyObservers();
    }

    public void releaseSpot(ParkingSpot spot)
    {
        //Release the already allocated spot.
        spot.removeVehicle();

        //Notify all observers about the availability of spots.
        notifyObservers();
    }

    public int getAvailableCount(SpotType type)
    {
        int count = 0;

        for(ParkingSpot spot: parkingSpots)
        {
            if(spot.getSpotType() == type  && !spot.isOccupied())
            {
                count++;
            }

        }
        return count;
    }
    //Display all parking spots on specific floor
    public void displayFloor()
    {
        System.out.println();

        System.out.println("Floor : "+floorNumber);
        
        for(ParkingSpot spot: parkingSpots)
        {
            spot.display();
        }
    }

}

//////////////////////////////////////////////////////////////////////////
//  Step7: ParkingDisplayBoard class
//  It is used to create a class which displays the parking 
//  status 
//  Subject  ->  ParkingFloor
//  Observer ->  ParkingDisplayBoard
//
//  Note : Any observer is going to observe the subject
//  There will be multiple observers for one subject
//  Concept: Observer Design Pattern
//////////////////////////////////////////////////////////////////////////

class ParkingDisplayBoard implements ParkingObserver
{
    //Floor whose availability is displayed by this board.
    private ParkingFloor floor;

    //Constructor
    public ParkingDisplayBoard(ParkingFloor floor)
    {
        this.floor = floor;
    }

    //Automatically called whenever floor availability changes
    @Override
    public void update()
    {
        System.out.println();
        System.out.println("-------------------------Display Board-----------------");
        System.out.println("--------------------------------------------------------");

        System.out.println("Floor : "+floor.getFloorNumber());
        System.out.println("Available Bike spots :"+floor.getAvailableCount(SpotType.BIKE));
        System.out.println("Available Car spots :"+floor.getAvailableCount(SpotType.CAR));
        System.out.println("Available Truck spots :"+floor.getAvailableCount(SpotType.TRUCK));
        
      
        System.out.println("--------------------------------------------------------");
        System.out.println();

    }
}
// We can create the new observers for the same subject
/*
    class ParkingWebsite implements ParkingObserver
    {
        public void update()
        {

        }

    }
*/


//////////////////////////////////////////////////////////////////////////
//  Step8: Create ParkingStrategy class

//  It is used to create a class which displays the ParkingStrategy which is
//  responsible to decide the parking spot selection.

//  Concept: Strategy Design Pattern
//////////////////////////////////////////////////////////////////////////

// Defines a common concepts for parking spot selection algorithm.
interface ParkingStrategy
{
    ParkingSpot findSpot(List <ParkingFloor> floors, Vehicle vehicle);
}


//Selects the first available parking spot
class FirstAvailableParkingStrategy implements ParkingStrategy
{
    @Override
    public ParkingSpot findSpot(List <ParkingFloor> floors, Vehicle vehicle)
    {
        //Iterate over all available floors
        for(ParkingFloor floor : floors)
        {
            ParkingSpot spot = floor.findAvailableSpot(vehicle);

            if(spot != null)
            {
                return spot;
            }
        }
        
        return null;
    }
}


//////////////////////////////////////////////////////////////////////////
//  Step9: Create PricingStrategy class

//  It is used to create a class PricingStrategy 
//  It keeps the pricing algorithm independent of exit logic

//  Concept: Strategy Design Pattern
//////////////////////////////////////////////////////////////////////////

interface PricingStrategy
{
    double calculatePrice(Vehicle vehicle, long hours);
    
}

class NormalPricingStrategy implements PricingStrategy
{
    @Override
    public double calculatePrice(Vehicle vehicle, long hours)
    {
        if(hours <= 0)
        {
            hours = 1;
        }

        switch(vehicle.getVehicleType())
        {
            case BIKE:
                return hours * 20;

            case CAR:
                return hours * 50;
                
            case TRUCK:
                return hours * 100;

            default:
                return 0;
        }
    }

}

class WeekendPricingStrategy implements PricingStrategy
{
    @Override
    public double calculatePrice(Vehicle vehicle, long hours)
    {
        if(hours <= 0)
        {
            hours = 1;
        }

        switch(vehicle.getVehicleType())
        {
            case BIKE:
                return hours * 40;

            case CAR:
                return hours * 100;
                
            case TRUCK:
                return hours * 200;

            default:
                return 0;
        }
    }

}



//////////////////////////////////////////////////////////////////////////
//  Step10: Create PaymentStrategy class

//  It is used to create a class PaymentStrategy 
//  It supports different types of payment methods

//  Concept: Strategy Design Pattern
//////////////////////////////////////////////////////////////////////////

//Common contract for all payment methods
interface PaymentStrategy 
{
    void pay(double amount);
}

class UPIPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount)
    {
        System.out.println("UPI Payment successfull : Rs "+amount);
    }
}
class CardPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Card Payment successfull : Rs "+amount);
    }
}
class CashPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Cash Payment successfull : Rs "+amount);
    }
}
class program1007
{
    public static void main(String A[])
    {

    }
}


