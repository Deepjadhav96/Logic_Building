//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.

import java.util.*;

class program734
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");//Deleimieter is space

        System.out.println("Number of words : "+Tokens.length);

    }
}