import java.util.*;

class DigitX
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;


        while(iNo != 0)
        {
           iDigit =  iNo % 10;
           if(iDigit == 7)
           {
            iCount ++;
           }
           iNo = iNo / 10;
           
        }

        return iCount;
    }

}

class program85
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();


        System.out.println("Enter a number:");

        int iValue = 0;
        int iRet = 0 ;

        iValue = sobj.nextInt();

       iRet = dobj.CountDigits(iValue);
       System.out.println("Number of digits are:"+iRet);
    }
}