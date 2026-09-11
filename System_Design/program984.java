//Builder 

class ParkingTicket
{
    private int tikcetNumber;
    private String vehicleNumber;
    private int floornNumber;
    private int spotNumber;
    private String entryTime;


    public ParkingTicket(int a, String b, int c, int d, String e)
    {
        this.tikcetNumber = a;
        this.vehicleNumber = b;
        this.floornNumber = c;
        this.spotNumber = d;
        this.entryTime = e;

    }



}


class program984 
{
    public static void main(String A[])
    {
        ParkingTicket p1 = new ParkingTicket(11,"MH12 VL7172",3,89,"9:30 AM");
        ParkingTicket p2 = new ParkingTicket(12,"MH14 VL7020",4,32,"9:50 AM");

    }
}