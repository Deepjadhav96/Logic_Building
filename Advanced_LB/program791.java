import java.util.*;


clas Matrix
{
    public int Arr[][];

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside constructor");

        Arr = new int[iRow][iCol];

    }
     protected void finalize()
     {
        System.out.println("Inside the finalize method");

        Arr = null;
        System.gc();
     }


}



class program790
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter number of rows:");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns:");
        iCol = sobj.nextInt();


        Matrix mobj = new Matrix(iRow, iCol);
        mobj = null;

        System.gc();

        // System.out.println("Enter the elemnts of Matrix: ");

        // for(i = 0; i < iRow; i++ )
        // {
        //     for(j = 0; j < iCol; j++)
        //     {
        //         Arr[i][j] = sobj.nextInt();
        //     }
        // }
        
        // System.out.println("Elemnts of Matrix: ");

        // for(i = 0; i < iRow; i++ )
        // {
        //     for(j = 0; j < iCol; j++)
        //     {
        //         System.out.print(Arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }


    }
}

