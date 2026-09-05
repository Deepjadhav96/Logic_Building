//Merge two sorted array [Two pointer approach]

import java.io.*;

class program4
{
    public static void main(String A[])
    {
        int Arr[] = {1,3,5};
        int Brr[] = {2,4,6,8};
        int Res[] = new int[Arr.length + Brr.length];

        int i = 0, j =0;
        int id = 0;

        while(i < Arr.length && j < Brr.length)
        {
            if(Arr[i] <= Brr[j])
            {
                Res[id] = Arr[i];
                id++;
                i++;
            }
            else
            {
                Res[id] = Brr[j];
                id++;
                j++;

            }
        }

        while(i < Arr.length)       //edge case handle [if above i goes next to length then this will handle]
        {
            Res[id] = Arr[i];
            id++;
            i++;
        }

        while(j < Brr.length)
        {
            Res[id] = Brr[j];
            id++;
            j++;
        }

        for(int k = 0; k < Res.length; k++)
        {
            System.out.print(Res[k]+"\t");
        }
        
        System.out.println();

    }
}