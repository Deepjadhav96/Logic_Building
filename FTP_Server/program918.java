import java.io.*;
import java.net.*;

class program918
{
    public static void main (String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-----------------------------------");
            System.out.println("----Marvellous Server Started------");
            System.out.println("-----------------------------------");

            System.out.println("Server is waitng for client request");

            Socket clientsocket = serversocket.accept();
            
            System.out.println("Client connected successfully");


        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}