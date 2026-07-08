////////////////////////////////
/////Input: 7
/////
/////Output: A * B * C * D 
/////
///////////////////////////////

import java.util.*;
class program186
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch1 = '\0',ch2 = '\0';

        for(iCnt = 1, ch1 = 'A',ch2 = 'a'; iCnt <= iNo; iCnt++,ch1++,ch2++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(ch1+"\t");
            }
            else
            {
              System.out.print(ch2+"\t");
            }
        }
           
        System.out.println();

        
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of element:");
        iValue = sobj.nextInt();

        Display(iValue);

    }
}