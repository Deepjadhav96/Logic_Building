/*
Enter number of element:
8
a	b	c	d	e	f	g	h
*/

import java.util.*;

class program178
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
         System.out.print(ch+"\t");
         ch++;
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