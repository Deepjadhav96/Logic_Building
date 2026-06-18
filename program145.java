import java.util.*;


class program38
{
    public static void Update(int Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt]++;
        }

        System.out.println("Array element after function call:");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
               System.out.println(Arr[iCnt]);
            
        }

    }
    public static void main(String A[])
    {
            Scanner sobj = new Scanner(System.in);

            int Brr[] = {10,20,30,40,50};

            int iCnt = 0;

            System.out.println("Array element before function call:");
            for(iCnt = 0; iCnt < Brr.length; iCnt++)
            {
               System.out.println(Brr[iCnt]);
            
            }

            Update(Brr);

    }
}