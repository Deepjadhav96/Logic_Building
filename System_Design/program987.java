//Builder 

class ParkingTicket
{
    private int tikcetNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;


    // public ParkingTicket(int a, String b, int c, int d, String e)
    // {
    //     this.tikcetNumber = a;
    //     this.vehicleNumber = b;
    //     this.floorNumber = c;
    //     this.spotNumber = d;
    //     this.entryTime = e;

    // }

    public ParkingTicket (Builder builder)
    {
        this.tikcetNumber = builder.tikcetNumber;
        this.vehicleNumber = builder.vehicleNumber;
        this.floorNumber = builder.floorNumber;
        this.spotNumber = builder.spotNumber;
        this.entryTime = builder.entryTime;
    }

    public void Display()
    {
        System.out.println("Ticket number: "+this.tikcetNumber);
        System.out.println("Vehicle number: "+this.vehicleNumber);
        System.out.println("Floor number: "+this.floorNumber);
        System.out.println("Spot  number: "+this.spotNumber);
        System.out.println("Entry time: "+this.entryTime);
    }



}

class Builder
{
    public int tikcetNumber;
    public String vehicleNumber;
    public int floorNumber;
    public int spotNumber;
    public String entryTime;

    public Builder setTicketNumber(int tikcetNumber)
    {
        this.tikcetNumber = tikcetNumber;
        return this;
    }

    public Builder setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Builder setFloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }

    public Builder setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return this;
    }

    public Builder setEntryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }

    public ParkingTicket build()
    {
        return new ParkingTicket(this);
    }
}

class program987
{
    public static void main(String A[])
    {
      
      ParkingTicket pobj = new Builder()
      .setTicketNumber(11)
      .setVehicleNumber("MH12VL9080")
      .setFloorNumber(4)
      .setSpotNumber(89)
      .setEntryTime("10:30 AM")
      .build();

      pobj.Display();
    }
}