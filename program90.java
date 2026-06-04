
import java.util.*;

class DigitX
{
    public int SumDigits(int iNo)
    {
       
        int iSum = 0;


        while(iNo != 0)
        {
             iNo % 10;
        
             iSum = iSum + (iNo % 10);
        
           iNo = iNo / 10;
           
        }

        return iSum;

        
    }

}

class program90
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();


        System.out.println("Enter a number:");

        int iValue = 0;
        int iRet = 0 ;

        iValue = sobj.nextInt();

       iRet = dobj.SumDigits(iValue);
       System.out.println("Summantion of digits is: "+iRet);
    }
}