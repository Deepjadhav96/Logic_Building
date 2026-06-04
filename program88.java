import java.util.*;

class DigitX
{
    public void CountEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenCount = 0, iOddCount = 0;


        while(iNo != 0)
        {
           iDigit =  iNo % 10;
           if(iDigit % 2 == 0)
           {
            iEvenCount ++;
           }
           else
           {
            iOddCount++;
           }
           iNo = iNo / 10;
           
        }

       System.out.println("Number of even digits are : "+iEvenCount);
       System.out.println("Number of odd digits are  : "+iOddCount);


    }

}

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();


        System.out.println("Enter a number:");

        int iValue = 0;
        

        iValue = sobj.nextInt();

       dobj.CountEvenOddDigits(iValue);
       
    }
}