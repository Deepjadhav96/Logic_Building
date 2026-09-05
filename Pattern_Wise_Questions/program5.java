// Square the elements of Array and Sort it.
import java.io.*;
import java.util.*;

class program5
{
    public static void main(String A[])
    {
        
           int iArr[] = {-4,-3,-2,0,1,2};

           int Neg[] = new int[3];
           int Pos[] = new int[3];

           int  i = 0, j = 0;

           for(int num: iArr)
           {
            if(num < 0)
            {
                Neg[i] = num ;
                i++;
            }
            else
            {
                Pos[j] = num;
                j++;
                
            }
           }
        //   System.out.println(Arrays.toString(Neg));
        //   System.out.println(Arrays.toString(Pos));

        int l = 0;
        for(int num: Neg)
        {
            Neg[l] = num * num;
            l++;
        }

        System.out.println(Arrays.toString(Neg));

        int m = 0;
        for(int num: Pos)
        {
            Pos[m] = num * num;
            m++;
        }

        System.out.println(Arrays.toString(Pos));

        for (int k = 0; k < Neg.length / 2; k++) 
        {
                int temp = Neg[k];
                Neg[k] = Neg[Neg.length - 1 - k];
                Neg[Neg.length - 1 - k] = temp;
        }

        System.out.println(Arrays.toString(Neg));

        int x = 0, y = 0;
        int Res[] = new int[Pos.length + Neg.length];
        int r = 0;

        while( x < Pos.length && y < Neg.length)
        {
            if(Pos[x] <= Neg[y])
            {
                Res[r] = Pos[x];
                r++;
                x++;
            }
            else
            {
                Res[r] = Neg[y];
                r++;
                y++;

            }
        }
        while(x < Pos.length)
        {
             Res[r] = Pos[x];
             r++;
             x++;
        }

        while(y < Neg.length)
        {
             Res[r] = Neg[y];
             r++;
             y++;
        }

        
            
        System.out.println(Arrays.toString(Res));

    }
}