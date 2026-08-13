/*
    Input: my name is deep
    Output: My Name Is Deep

    Input: mY NAME is DeEp
    Output: My Name Is Deep

*/
import java.util.*;

class program740
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        System.out.println(str);


    }
}


//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.
//Length of each word.
//Largest of string
//Make a string Camel case