import java.util.*;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        for( ;iNo != 0; )                   //for(;;) --> new way to write the for loop
        {
           iDigit =  iNo % 10;
           System.out.println(iDigit);
           iNo = iNo / 10;
        }
    }

}

class program81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();


        System.out.println("Enter a number:");

        int iValue = 0;

        iValue = sobj.nextInt();

        dobj.DisplayDigits(iValue);
    }
}