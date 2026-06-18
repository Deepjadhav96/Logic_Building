import java.util.*;


class program40
{
    public static void main(String A[])
    {
            Scanner sobj = new Scanner(System.in);

            int Arr[] = {10,20,30,40,50};


            for(int iCnt = 0; iCnt < Arr.length; iCnt++)  // Bad programming practice
            {
               System.out.println(Arr[iCnt]);
            
            }

            System.out.println(iCnt);                     // error due to icnt is not accesible due to declaration is in for loop

    }
}