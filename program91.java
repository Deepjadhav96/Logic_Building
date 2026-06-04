import java.util.*;

class DigitX
{
    public int SumEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenSum = 0;


        while(iNo != 0)
        {
           iDigit =  iNo % 10;
           if(iDigit % 2 != 0)
           {
             iEvenSum = iEvenSum + iDigit;
           }
           iNo = iNo / 10;
           
        }

        return iEvenSum;
    }

}

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();


        System.out.println("Enter a number:");

        int iValue = 0;
        int iRet = 0 ;

        iValue = sobj.nextInt();

       iRet = dobj.SumEvenDigits(iValue);
       System.out.println("Summation of even digits are: "+iRet);
    }
}