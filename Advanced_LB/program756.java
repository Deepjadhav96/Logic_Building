import java.util.*;

class program756
{

    public static boolean CheckAnagram(String str1, String str2)
    {
        return true;

    }
    public static void main(String A[])
    {
        int i =0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter a second string :");
        String str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }

    }
}


//Accept a string from user and remove white space and remove extra spaces in between words and 
//split that string and dislpay the count of word.
//Length of each word.
//Largest of string
//Make a string Camel case
//Revers a string using in built reverse()method
//Frequency of word name
//Frequency of each character of string.
//Anagram