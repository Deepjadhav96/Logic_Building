import java.util.*;

class program757
{

    public static boolean CheckAnagram(String str1, String str2)
    { 

        if(str1.length() != str2.length())
        {
            return false;
        }
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        str1 = new String(Arr);
        str2 = new String(Brr);

        return (str1.equals(str2));


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
//Anagram *


