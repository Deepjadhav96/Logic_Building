import java.util.*;
class program776
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        HashMap <Character,Integer> hobj = new HashMap<Character,Integer>();

        System.out.println("Enter a string:");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        int iCount = 0;

        for( char ch : Arr)           //for each loop
        {
                if(hobj.containsKey(ch))          //If its already exist
                {
                    iCount = hobj.get(ch);      //old frequency
                    hobj.put(ch , iCount+1);   // add old freq + 1
                }
                else
                {
                    hobj.put(ch , 1);
                }

        }
            

        char Brr[] = new char[hobj.size()];
        int i = 0;
        for(char cValue : hobj.keySet())
        {
            Brr[i] = cValue;
            i++;
        }

        System.out.println(new String(Brr));

    }
}

//Accept a string from user and return the unique character of it