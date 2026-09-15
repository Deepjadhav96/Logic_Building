import java.io.*;
import java.util.*;

class program662
{
    public static void main(String A[]) 
    {
        File fobj = null;
        boolean bRet = false;
        Scanner sobj = null;
        String Fname = null;

        sobj = new Scanner(System.in);
        System.out.println("Enter the file name:");
        Fname = sobj.nextLine();
        

        try
        {
          fobj = new File(Fname);

          bRet = fobj.exists();

          if(bRet==true)
          {
            fobj.createNewFile();
            System.out.println("File gets created successfully...");
          }
          else
          {
            System.out.println("file is already exist..!");

          }
        }      
        catch(Exception eobj)
        {
            System.out.println(eobj);

        }
    }
}