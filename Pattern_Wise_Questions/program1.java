import java.io.*;

class program1
{
    public static void main(String A[])
    {
        int Arr[] = {11,11,23,34,34,34,96};

        int cm = 1;
        int officer = 0;
        int unique = 1;

        while(cm < Arr.length)
        {
            if(Arr[cm]==Arr[cm-1])
            {
                cm++;
                // continue;
            }
            if(Arr[cm] != Arr[cm-1])
            {
                Arr[officer+1] = Arr[cm];
                cm++;
                officer++;
                unique++;
            }
        }

        for(int i = 0; i < unique; i++)
        {
             System.out.print(Arr[i]+"\t");
        }
        System.out.println();

        System.out.println("Unique elements are: "+unique);

    }
}