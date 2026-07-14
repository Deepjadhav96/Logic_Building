/*
        iRow = 6
        iCol = 6

    %	%	%	%	%	%	
    %	@	@	@	@	%	
    %	@	@	@	@	%	
    %	@	@	@	@	%	
    %	@	@	@	@	%	
    %	%	%	%	%	%		


*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        

        for(i = 1; i <= iRow; i++)
        {

            for(j=1; j<=iCol; j++)
            {
                if(j == 1 || j == iCol || i == 1 || i == iRow)          //Diagonal Printing
                {
                    System.out.print("%\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        
        }
    }

}
class program214
{

    public static void main(String A[])
    {
         Scanner sobj = new Scanner(System.in);
        int iValue1 = 0 , iValue2 = 0;
        Pattern pobj = new Pattern();

        System.out.println("Enter number of rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of column:");
        iValue2 = sobj.nextInt();


        pobj.Display(iValue1, iValue2);

    }
}