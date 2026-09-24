import java.util.*;


clas Matrix
{
    public int Arr[][];
    public int iRow;
    public int iCol;

    public int Matrix(int iRow, int iCol)
    {
        System.out.println("Inside constructor");
        
        this.iRow = iRow;
        this.iCol = iCol;
        
        Arr = new int[iRow][iCol];

    }
     protected void finalize()
     {
        System.out.println("Inside the finalize method");

        Arr = null;
        System.gc();
     }

     public void Accept()
     {
        Scanner sobj = new Scanner(System.in);
     

        public void Display()
        {
        for(int i = 0; i < iRow; i++ )
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }  

     }

     public void Display()
     {
        System.out.println("Elemnts of Matrix: ");
        for(int i = 0; i < iRow; i++ )
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

     }
}
}



class program792
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

        mobj.Display();
        mobj.Accept();

        System.gc();


    }
}

