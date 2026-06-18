import java.util.*;

class ArrayX
{
     public  void Update(int Arr[])
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
}


class program147
{
    public static void main(String A[])
    {
            Scanner sobj = new Scanner(System.in);
            int iCnt = 0;

            System.out.println("Enter the number of elements ");

            int iLength = sobj.nextInt();

            int Brr[] = new int[iLength];

            System.out.println("Enter the elements: ");
            for(iCnt = 0; iCnt < Brr.length; iCnt++)
            {
              Brr[iCnt] = sobj.nextInt();
                
            }

            System.out.println("Elements of the array are: ");

            for(iCnt = 0; iCnt < Brr.length; iCnt++)
            {
              System.out.println(Brr[iCnt]);
            }

            ArrayX aobj = new ArrayX();
            aobj.Update(Brr);                //Call by reference is used here 

            Brr = null;

            System.gc();
    }
}