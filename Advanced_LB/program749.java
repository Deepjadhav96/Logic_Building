/*
    Input: my name is deep school name is abhinav city name is pune
    Output: 3

*/
import java.util.*;

class program749
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("//s+"," ");

        String Tokens[] = str.split(" ");

        int iCount = 0;
        
        for(int i =0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("name"))
            {
                iCount++;
            }
        }
        
        System.out.println("Frequency of wprd is :"+iCount);
    }
}


//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.
//Length of each word.
//Largest of string
//Make a string Camel case
//Revers a string using in built reverse()method
//Frequency of word name