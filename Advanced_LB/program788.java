import java.util.*;

class program788
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter number of rows:");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns:");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];//Dynamic 2D array

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);

    }
}

