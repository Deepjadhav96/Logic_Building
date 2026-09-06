//Design pattern factory
enum VehicleType
{
    BIKE,
    CAR,
    TRUCK
}

abstract class Vehicle
{
    private String number;
    
    public Vehicle(String no)
    {
        this.number = no;
    }

    public String getNumber()
    {
        return this.number;
    }

    public abstract void display();
    
}

class Bike extends Vehicle
{
    public Bike(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Bike : "+getNumber());
    }
}
class Car extends Vehicle
{
    public Car(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Car : "+getNumber());
    }

}
class Truck extends Vehicle
{
    public Truck(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Truck : "+getNumber());
    }

}

class VehicleFactory
{
    public static Vehicle createVehicle(VehicleType type, String number)
    {
        switch(type)
        {   
            case BIKE:
                return new Bike(number);

            case CAR:
                return new Car(number);

            case TRUCK:
                return new Truck(number);

            //default misssing error   
        }

    }
}

class program978
{
    public static void main(String A[])
    {
        Vehicle v1 = VehicleFactory.createVehicle(VehicleType.BIKE,"MH12VL9080");
        Vehicle v2 = VehicleFactory.createVehicle(VehicleType.CAR,"MH12VL0911");
        Vehicle v3 = VehicleFactory.createVehicle(VehicleType.TRUCK,"MH12VL2211");

        v1.display();
        v2.display();
        v3.display();
    }
}

