//Convert it into generic


import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;

    // Constructor
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of Matrix:");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of Matrix:");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int SummationAll()
    {
        int iSum = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
               iSum = iSum + Arr[i][j];
            }

        }
        return iSum;
    }

    public void SummationRow()
    {
        int iSum = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
               iSum = iSum + Arr[i][j];
            }
            System.out.println("Summation of row :"+Arr[i]+" is Summation"+iSum);
            int iSum = 0;
        }
    }
    public int MaximumAll()
    {
        int iMax = 0;

        iMax = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }

        }
        return iMax;
    }

     public int MinimumAll()
    {
        int iMin = 0;

        iMin = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }

        }
        return iMin;
    }
}

class program801
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int iRet = 0;

        System.out.println("Enter number of rows:");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns:");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();
        System.out.println("Summation of all elements are: "+iRet);

        mobj.SummationRow();


        iRet = mobj.MaximumAll();
        System.out.println("Maximum number is:"+iRet);

        iRet = mobj.MinimumAll();
        System.out.println("Minimum number is:"+iRet);




        mobj = null;

        System.gc();
    }
}

// //Error
// program800.java:82: error: variable iSum is already defined in method SummationRow()
//             int iSum = 0;
//                 ^
// 1 error
// error: compilation failed
