class ParkingLot
{
    private static ParkingLot instance;                             //Self referential class

    private ParkingLot()
    {
        System.out.println("Parking Lot object gets created");
    }

    public static ParkingLot getInstance() //Not an in built()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }

        return instance;
    }
}

class program973
{
    public static void main(String A[])
    {
        // ParkingLot pobj1 = new ParkingLot();        //Error

        ParkingLot pobj1 = ParkingLot.getInstance();
        ParkingLot pobj2 = ParkingLot.getInstance();
        ParkingLot pobj3 = ParkingLot.getInstance();
    }
}

