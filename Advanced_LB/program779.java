import java.util.*;
class program778
{
    public static void main(String A[])
    {
        
        HashMap <String , Integer>hobj = new HashMap<String , Integer>();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");
        int iCount = 0;
        for(String s: Tokens)
        {
            if(hobj.containsKey(s))
            {
                iCount = hobj.get(s);
                hobj.put(s,iCount+1);
            }
            else
            {
                hobj.put(s, 1);
            }
        }

        System.out.println(hobj);
    }
}

