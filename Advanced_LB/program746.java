/*
    Input: my name is deep
    Output: ym eman si peed

*/
import java.util.*;

class program741
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("//s+"," ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer();



        for(int i =0 ;i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);

            sb = sb.reverse();

            FinalStr = FinalStr.append(sb);
        }

        System.out.println(FinalStr);
    }
}


//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.
//Length of each word.
//Largest of string
//Make a string Camel case
//Revers a string using in built reverse()method