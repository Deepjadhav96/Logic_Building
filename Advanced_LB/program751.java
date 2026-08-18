/*
    Input: india is my country i live in india
    Output: bharat is my country i live in bharat

*/
import java.util.*;

class program751
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("//s+"," ");

        String Tokens[] = str.split(" ");

        StringBuffer Finalstr = new StringBuffer("");

        for(int i =0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india"))
            {
                Finalstr = Finalstr.append("Bharat");
                Finalstr = Finalstr.append(" ");

                continue;
            }

            Finalstr = Finalstr.append(Tokens[i]);
            Finalstr = Finalstr.append(" ");

        }

        String Output = new String(Finalstr);

        Output = Output.trim();

        System.out.println(Output);

    }
}


//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.
//Length of each word.
//Largest of string
//Make a string Camel case
//Revers a string using in built reverse()method
//Frequency of word name